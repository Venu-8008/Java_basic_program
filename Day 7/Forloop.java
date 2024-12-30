package Venu;

import java.util.Iterator;

public class Forloop {

	public static void main(String[] args) {
		int sum=0,range=20,i;
		for(i=0;i<range;i++)
		{
			if(i%2==0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);


	}

}
