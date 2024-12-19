package Venu;

import java.util.Scanner;

public class GreatestOf3Numbers {
	public void gt3num(int num1,int num2,int num3) {
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greater");
			
		}
		else if(num2>num3) {
			System.out.println("num2 is greater");
			
			
		}
		else {
			System.out.println("num3 is greater ");
		}
		
	}
	





	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the third number");
		int num3=sc.nextInt();
		GreatestOf3Numbers gn=new GreatestOf3Numbers();
		
		gn.gt3num(num1, num2, num3);

	}

}
