package Venu;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array_size = sc.nextInt();
		int [] arr = new int[array_size];
		for(int i=0; i<array_size; i++) {
		System.out.println("enter the array"+i+":");
		arr[i] = sc.nextInt();
		}
		int even=0,odd=0;
		for(int j=0;j<array_size;j++) {
			if(arr[j]%2==0)
			{
				even+=arr[j];
				System.out.println("even numbers:"+arr[j]);
				
			}
			else
				odd+=arr[j];
			System.out.println("odd numbers:"+arr[j]);
		}
		System.out.println("sum of even numbers:"+even+"\nsum of odd numbers:"+odd);
		
	    int max = arr[0],min=arr[0];
		for(int k=0;k<array_size;k++) {
			
			if(arr[k]<min)
			{
				min=arr[k];
			}
			if(arr[k]>max)
			{
				max=arr[k];
			}
			
			
		}System.out.println("max_num:"+max);
		
	}

}
