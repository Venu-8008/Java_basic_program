package Venu;

import java.util.Scanner;

public class Prime1 {
	static void primeNumber(int num) {
		int i;
		boolean value=true;
		for(i=2;i<num;i++)
		{
			
			if(num%i==0) {
				value=false;
			}
			else {
				value=true;
			}
		
			
		}
		if(value)
			System.out.println(i+"prime");
		else
			System.out.println("not prime");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		primeNumber(num);
		
		

	}

}
