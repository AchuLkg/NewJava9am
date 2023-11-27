package login;

public class InstanceVariable {
	int a;
	public void sample() {
		a=100;
		System.out.println("a in meth:"+a);
	}
	public static void main(String[] args) {
		
		InstanceVariable i = new InstanceVariable();
		System.out.println("a is before calling:"+i.a);
		i.sample();
		
		

	}

}
