//program using unary operator

public class UnaryEx
{
	public static void main(String [] args)
	{
		int num1=25;
		System.out.println(num1);
		int num2=num1++;
		System.out.println(num2);
		num2=--num2;
		System.out.println(num2);
		num2=num2++;
		System.out.println(num2);
		num2=--num2;
		System.out.println(num2);
		

		char ch1='a';
		char ch2=++ch1;
		System.out.println(ch2);
	}
}