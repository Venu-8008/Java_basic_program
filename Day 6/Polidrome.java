package Venu;

import java.util.Scanner;

public class Polidrome {
	
	static void ispolyndrome(int num) {
		int reverse=0,reminder,temp;
		temp=num;
		while(num>0) {
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
		}
		if(temp==reverse)
			System.out.println("polyindrome");
		else
			System.out.println("not polyindrome");
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		ispolyndrome(num);
		
	

	}

}
