package Venu;

public class ContinueBreak {
	static void printnum(int range) {
		for(int i=1;i<range;i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		printnum(67);
		

	}

}
