 //static method program


class ExampleStatic{
	int num;
	static int value;

	static {
		System.out.println("static block");
	}
	public static void message(){
		System.out.println("static method");
	}
	public void access(){
		System.out.println(num+"\n"+value);
	}
	
}

public class StaticDemo{
	public static void main(String [] args){
		ExampleStatic.message();


		ExampleStatic es=new ExampleStatic();
		es.message();
		
		es.access();
		es.num=20;
		es.value=500;		
		es.access();

	}
}