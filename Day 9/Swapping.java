package Venu;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		//initialize the variables
		int num1,num2;
		//take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 value:");
		num1=sc.nextInt();
		System.out.println("enter num2 value:");
		num2=sc.nextInt();
		//swapping logic
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		//printing the numbers
		System.out.println("num1 value is:"+num1);
		System.out.println("num2 value is:"+num2);
		
	}

}
