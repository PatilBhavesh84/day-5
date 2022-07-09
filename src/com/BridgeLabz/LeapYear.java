package com.BridgeLabz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int y =sc.nextInt();
		if(y%4==0){
			System.out.println(y+ " is a leap year");
		}
		else {
			System.out.println(y+ " is not a leap year");

		}
	}
}