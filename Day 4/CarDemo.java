package Ajp;

import Venu.Car;

public class CarDemo extends Car {

	public static void main(String[] args) {
		Car car=new Car();
		car.speed=250;
		
		CarDemo card=new CarDemo();
		card.name="Ford";
		card.speed=200;
		card.setupMillage(20);
		
		

	}

}
