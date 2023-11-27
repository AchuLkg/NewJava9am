package test;

public class Nested {

	public static void main(String[] args) {
		int s=18;
		if(s<10) {
			if(s%2!=0)
				System.out.println("s is an even number");
			
			else
				System.out.println("s is an odd number");
		}
		else {
			System.out.println("s is less than 10");
		}

	}

}
