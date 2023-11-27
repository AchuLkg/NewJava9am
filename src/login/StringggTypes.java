package login;
//muta
public class StringggTypes {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		System.out.println(s);
		int i = System.identityHashCode(s);
		System.out.println(i);
		
		StringBuffer s1 = new StringBuffer("Java");
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		
		StringBuffer append = s1.append(s);
		System.out.println(append);
		int j = System.identityHashCode(append);
		System.out.println(j);
}

}
