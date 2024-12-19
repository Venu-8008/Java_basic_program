package Venu;

public class WhileEx {
	static int sum(int limit) {
		int sum=0;
		int num=1;
		while(num<=limit) {
			sum+=num;
			num++;
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(sum(50));
	}

}
