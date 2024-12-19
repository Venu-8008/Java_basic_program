package Venu;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("choosen 0");
			
			break;
			
		case 1:
			System.out.println("choosen 1");
			break;
		case 2:
			System.out.println("choosen 2");
			break;
			
		default:
			System.out.println("invalid choice");
		}

	}

}
