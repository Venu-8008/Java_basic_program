package Venu;

public class SBI extends RBI {
	int  no_employees;
	String address;
	String manager;
	SBI(){
		super();
		System.out.println("SBI constructor");
	}
	private SBI(int bankcode, String name,String address,String type,int no_employes, String manager) {
		super(bankcode,name,type);
		this.address=address;
		this.name=name;
		this.manager=manager;
		System.out.println("SBI details:"+address+","+no_employees+","+manager);
		
	}

	public static void main(String[] args) {
		SBI sbi = new SBI(123,"SBI","Hyderabad","Nationalize",676,"dfghj");

	}

}

