package test;

public class Ladder {

	public static void main(String[] args) {
		int a=10,b=100,c=75;
		
		if(a>b&&a>c) {
			System.out.println("a is greater");
		}else 
			
			if(b<a&&b>c) {
			System.out.println("b is greater");
		}else 
			
			if(c>a&&c>b) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("all are equal");
			
		}

	}

}
