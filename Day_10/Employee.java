package Venu;

public abstract class Employee {
	 final int salary,pf;
	public Employee(int salary, int pf) {
		this.salary=salary;
		this.pf=pf;
		

	}

	void display() {
	
		System.out.println(salary+pf);
	
	
	}
	abstract void getsal();
}
