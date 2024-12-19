package Venu;

import java.util.Scanner;

public class ThreeGreater {
	public static int gt3num(int num1,int num2,int num3) {
		if(num1>num2) {
			if(num1>num3) {
				return num1;
			
			}
		}
		else if (num2>num3) {
			return num2;
			
		}
		else {
			return num3;
		}
		return 0;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the third number");
		int num3=sc.nextInt();
		ThreeGreater.gt3num(num1, num2, num3);
		int greater=gt3num(num1, num2, num3);
		System.out.println("greatest number:"+greater);


	}

}
