package Venu;

public abstract class Car {
	int speed ;
	String company;
	abstract void display_details();
	void getinfo_car() {
		System.out.println(company+speed);
	}

}
