package Venu;

public class Main {

	public static void main(String[] args) {
		//creating objects for the subclasses
		Manali mn= new Manali();
		Mussoorie ms= new Mussoorie();
		Gulmarg gl= new Gulmarg();
		//calling the methods
		mn.location();
		mn.famousFor();
		ms.location();
		ms.famousFor();
		gl.location();
		gl.famousFor();
	}

}
