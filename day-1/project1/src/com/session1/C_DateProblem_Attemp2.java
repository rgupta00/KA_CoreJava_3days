package com.session1;

import java.util.Scanner;

public class C_DateProblem_Attemp2 {

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
		
		printDate(day, month, year);
	
		int noOfDays[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31 };
		
		if(isLeapYear(year)) {
			noOfDays[2]=29;
		}
	
		calculateNextDate(day, month, year, noOfDays[month]);

	}

	 static void printDate(int day, int month, int year) {
		System.out.println("date is :"+ day+"/"+month+"/"+ year);
	}
	
	static boolean isLeapYear(int year) {
		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else
			return false;
	}
	static void calculateNextDate(int day, int month, int year, int noOfDays) {
		day=day+1;
		if(day>noOfDays) {
			day=1;
			month=month+1;
			if(month>12) {
				month=1;
				year=year+1;
			}
		}
		printDate(day, month, year);
	}
}














