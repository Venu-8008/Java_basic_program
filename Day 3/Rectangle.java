//Method with return type

class AreaPerimeter{
	public int area(int l,int b){
		//function with terurn type 
		int a=l*b;
		//System.out.println(a);
		return a;
	}
	public void perimeter(int l,int b){
		//function without return type
		int peri=2*(l+b);
		System.out.println(peri);
	}
	public static int area1(int l,int b)
	{
		//function using static method
		int a=l*b;
		//System.out.println(a);
		return a;
	}
}
public class Rectangle{
	public static void main(String [] args){
		System.out.println(AreaPerimeter.area1(5,3));
		AreaPerimeter ap=new AreaPerimeter();
		
		System.out.println(ap.area(2,5));

		ap.perimeter(2,5);
		//ap.area1(2,5);
	}
} 	
