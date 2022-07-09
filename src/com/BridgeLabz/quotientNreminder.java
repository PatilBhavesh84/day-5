package com.BridgeLabz;
import java.util.Scanner;
public class quotientNreminder {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		a=sc.nextInt();
		System.out.println("Enter divisor");
		b=sc.nextInt();	
		c=a%b;
		System.out.println("Quotient="+a);
		System.out.println("Remainder="+c);
	}
}