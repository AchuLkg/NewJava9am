package test;

public class ExcepHandling {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("4");
		}catch(NumberFormatException e) {
			System.out.println("e");
		}catch(NullPointerException e) {
			System.out.println("Stringg");
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}finally {
			System.out.println("Done");
		}
		System.out.println(5);

	}

}
