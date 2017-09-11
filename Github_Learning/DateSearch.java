package myAndroid;

import java.util.Scanner;

public class DateSearch {

	public static void main(String[] args) {
		int monthDay[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		int year,month,day;
		
		System.out.println("请输入需要查询的日期(中间加空格)");
		Scanner scanner = new Scanner(System.in);
		
		//读取年月日
		year = Integer.parseInt(scanner.next());
		month = Integer.parseInt(scanner.next());
		day = Integer.parseInt(scanner.next());
		
		//年份计算
		 for (int i = 2012; i < year; i++){//判断每一年是否为闰年
		  if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		   sum += 366;
		  else
		   sum += 365;
		 }
		 
		 //月份计算
		 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)//当输入年份为闰年时二月变为29天
		   monthDay[1] = 29;
		 
		 for (int j = 0; j < month-1; j++){
		  sum += monthDay[j];//计算月份的天数
		 }
		 
		 //天数计算
		 sum += day;
		 sum -= 22;//减去初始天数
		 
		 //输出
		 System.out.println(sum % 7);
		 
		 //关闭scanner
		 scanner.close();
		
	}
}
