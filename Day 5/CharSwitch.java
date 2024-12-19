package Venu;

import java.util.Scanner;

public class CharSwitch {
	public static void main(String[] args) {
		char ch = 0;
		System.out.println("enter the character");
		Scanner sc=new Scanner(System.in);
		sc.next().charAt(ch);
		switch (ch) {
		case 'B':
			System.out.println("choosen B");
			break;
		
		case 'V':
			System.out.println("choosen V");
			break;
		case 'S':
			System.out.println("choosen S");
			break;
		
		default:
			System.out.println("Z");
			}
		
	}

}
