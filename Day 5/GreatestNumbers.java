package Venu;

import java.util.Scanner;

public class GreatestNumbers {
	public void gt2num(int num1,int num2) {
		
		if(num1==num2) {
			System.out.println("num1 equals to num2");
			
		}
		else if(num1>num2) {
			System.out.println("num1 is greater than num2");
			
			
		}
		else {
			System.out.println("num2 is greater than num1");
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		GreatestNumbers gn=new GreatestNumbers();
		
		gn.gt2num(num1, num2);
		

	}

}
