package Venu;

public class Fibanacii {
	
	
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("Fibnacii series:");
		while(a<=265) {
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
					
			
		}
	}

}
