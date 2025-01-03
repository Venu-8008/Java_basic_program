package Venu;

public class Overloading {
	int sum;
	void sum(int a, int b) {
		sum=a+b;
		System.out.println(sum);
	}
	int sum(int a, int b, int c) {
		sum=a+b-c;
		return sum;
		
	}
	void sum(double a,double b) {
		a+=b;
		System.out.println(a);
		
		
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println(o.sum(2,3,7));
		o.sum(2,5);
		o.sum(73,76);
		

	}

}
