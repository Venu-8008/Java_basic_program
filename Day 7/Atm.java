package Venu;

import java.util.Scanner;

public class Atm {
	static void atm()
	{
		boolean flag=true;
		while(flag) {
		System.out.println("menu");
		System.out.println(" 1.balance enquiry \n 2.credit amount \n 3.deposit amoint \n 4.exit");
		int ch;
		System.out.println("choose any option");
		Scanner sc= new Scanner(System.in);
		ch=sc.nextInt();
		
		switch (ch) {
		case 1: 
			System.out.println("your balance is ****");
			break;
		case 2: 
			System.out.println("amount credited");
			break;
		case 3: 
			System.out.println("amount deposit");
			break;
		case 4: 
			System.out.println("exit");
			flag=false;
			break;
		default:
			System.out.println("invalid chloce");
		}
		}
	}

	public static void main(String[] args) {
		atm();

	}

}
