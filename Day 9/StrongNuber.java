package Venu;

import java.util.Scanner;

public class StrongNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intializing the variables
		int num;
		int i,rem,sum=0,fact=1,number;
		//creating on=bject for the scanner class
		Scanner sc = new Scanner(System.in);
		//taking input from the user
		num=sc.nextInt();
		//copying the number to a another variable
		number=num;
		while(num>0) {
			//calculating the remainder
			rem=num%10;
			for(i=1;i<=rem;i++)
				//factorial logic
				fact*=i;				
			
			//adding all factorials
			sum+=fact;
			//division of a number
			num=num/10;
			
			
		}
		//check the number is strong number or not
		if(number==sum)//strong number condition
			//print if number is strong number
			System.out.println(sum+"its a strong number");
		else//not a strong number condition
			//print if not a strong number
			System.out.println(sum+"its not a strong number");

	}

}
