package Venu;

public class Department  {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setSalary(20000);
		e1.name="venu";
		e1.id=1234;
		System.out.println(e1.id+","+e1.name+","+e1.getSalary());

	}

}

