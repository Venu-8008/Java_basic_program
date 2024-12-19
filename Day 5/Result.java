package Venu;

import java.util.Scanner;

public class Result {
	int sub1,sub2,sub3,sub4;
	void findresult() {
		if (sub1>=26 && sub2>=26 && sub3>=26 && sub4>=26) {
			int total,avg;
			char grade;
			total=sub1+sub2+sub3+sub4;
			System.out.println(total);
			avg=total/4;
			System.out.println(avg);
			if(avg>=90) {
				grade='A';
				
			}
			else if (avg>=80) {
				grade='B';
				
			}
			else if (avg>=60) {
				grade='C';
			}
			else if (avg>=40) {
				grade='D';
			}
			else if (avg>=26) {
				grade='C';
				
			}
			else {
				grade='D';
			}
			
			switch (grade) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
					System.out.println("B");
				break;
			case 'C':
					System.out.println("C");
				break;
			case 'D':
					System.out.println("D");
				break;
			case 'E':
					System.out.println("E");
				break;
			default:
				System.out.println("Fail");
			}
			
		}
		 
	}
	

	public static void main(String[] args) {
		System.out.println("enter 4 subject marks:");
		Scanner sc=new Scanner(System.in);
		Result result =new Result();
		result.sub1=sc.nextInt();
		result.sub2=sc.nextInt();
		result.sub3=sc.nextInt();
		result.sub4=sc.nextInt();
		result.findresult();
		
		

	}

}
