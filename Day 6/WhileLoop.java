package Venu;

import java.util.Scanner;

public class WhileLoop {
	static void table() {
		int n,i = 1;
		System.out.println("enter table");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		while(i<=10) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
		
	}

	public static void main(String[] args) {
		table();
		

	}

}
