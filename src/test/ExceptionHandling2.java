package test;

public class ExceptionHandling2 {

	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);
		try {
			String s=null;
			System.out.println(s.charAt(2));
		}catch(NullPointerException e) {
			System.out.println("Null Value");
		}finally {
			System.out.println("Inner finally");
		}
	}catch(ArithmeticException e) {
		System.out.println("/by 0");
	}finally {
		System.out.println("Outer finally");
	}
	System.out.println(5);

	}

}
