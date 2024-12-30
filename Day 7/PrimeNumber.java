package Venu;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	static void prime(int target) {
		int num;
		boolean value = true;
		;
		 for(num=2;num<target;num++) {
			 if(target%num==0) {
				 value=false;
				 
			 }
			
			 
		 }
		 if(value) {
			 System.out.println(target+"is prime");
		 }
		 else
			 System.out.println(target+"is not prime");
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int target=sc .nextInt();
		prime(target);
		

	}

}
