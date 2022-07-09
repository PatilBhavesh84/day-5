package com.BridgeLabz;

import java.util.Scanner;

public class flipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the number of times you want to toss coin");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),h=0,t=0;

		for(int i=0;i<n;i++) {
			if (Math.random() <0.5) {
				t++;
			}
			else {
				h++;
			}
		}
		double headPercentage = (h*100)/n;
		double tailPercentage = (t*100)/n;

		System.out.println(+h+"-Head Percentage is "+headPercentage);
		System.out.println(+t+"-Tail Percentage is "+tailPercentage);
	}


}

