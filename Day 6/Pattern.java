package Venu;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int num,i = 1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(i<=num) {
			int j=1;
			while(j<=i-1) {
				System.out.print(j);
				j++;
			}
			System.out.println(i);
			i++;
		}
	}
}
