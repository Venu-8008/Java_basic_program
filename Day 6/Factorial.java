package Venu;

import java.util.Scanner;

public class Factorial {
	 void fact() {
		int n ;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int factorial=1;
		while (n>=1) {
			
			factorial*=n;
			n--;
			
			
			
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		Factorial f=new Factorial();
		
		f.fact();

	}

}
