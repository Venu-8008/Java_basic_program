package Venu;

import java.lang.reflect.Constructor;

public class Consructor {
	int id;
	String name;
	public Consructor() {//default contructor
		System.out.println("student object is created");
		
	}
	Consructor(int i, String name){//parameter contructor
		id=i;
		this.name=name;//this keyword it always points to the current method 
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Consructor c1=new Consructor();
		Consructor c2=new Consructor(2,"venuj");
		

	}

}
