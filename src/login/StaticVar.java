package login;

public class StaticVar {
	private static int a;
	public void sample() {
		a=100;
		System.out.println("a in method:"+a);
	}

	public static void main(String[] args) {
		StaticVar s = new StaticVar();
		s.sample();
		
		
		
		

	}

}
