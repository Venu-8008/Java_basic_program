package Venu;

public class ArrayInfo {

	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
