package Venu;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int range,num=0,sum=0;
		System.out.println("enter range:");
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		
		do {
			if(num%2==0) 
				sum+=num;
				num++;
			
			
		} while (num<=range);
		System.out.println(sum);
	}

}

