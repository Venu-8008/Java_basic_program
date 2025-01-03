package Venu;

public class EmployeeManagement extends Employee{
	int td;
	public EmployeeManagement(int salary, int pf,int td) {
		super(salary, pf);
		this.td=td;
		System.out.println(salary+pf+td);
		}
	void display() {
		System.out.println(salary+pf+td);
	}
	@Override
	void getsal() {
		System.out.println(this.salary);
		
	}

}
