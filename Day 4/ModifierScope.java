package Venu;

public class ModifierScope {

	public static void main(String[] args) {
		Car c=new Car();
		c.capacity=4;
		c.name="Audi";
		c.speed=250;
		c.setupMillage();
		
		System.out.println("car details:"+c.capacity+","+c.name+","+c.speed+","+c.getMillage());
	}

}
