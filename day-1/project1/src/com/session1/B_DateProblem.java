package com.session1;

import java.util.Scanner;

public class B_DateProblem {

	public static void main(String[] args) {
		/*
		 * given today date find out next date
		 */
		int day, month, year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE day month and year");
		day=scanner.nextInt();
		month=scanner.nextInt();
		year=scanner.nextInt();
		
		System.out.println("date is :"+ day+"/"+month+"/"+ year);
		/*
		 * 1. write logic to check no of days in each month
			2. ................................ leap year
			3. ................................ to increse 1 into current day
		 */
		//				0	1	2.............................12
		int noOfDays[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31 };
		
		//now i need to check if it is a leap year
		//copy paste is not a crime in programming
		
		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			noOfDays[2]=29;//if it is leap year then days must be 29
		}
		
		day=day+1;
		if(day>noOfDays[month]) {
			day=1;
			month=month+1;
			if(month>12) {
				month=1;
				year=year+1;
			}
		}
		
		System.out.println("next date is :"+ day+"/"+month+"/"+ year);
	}
}














