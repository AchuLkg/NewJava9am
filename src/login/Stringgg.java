package login;

public class Stringgg {
	public static void main(String[] args) {
		
		String s ="Welcome to java classes in sla";
		System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		//to check whether the string starts with or not
		boolean startsWith = s.startsWith("welcome");
		System.out.println(startsWith);
		
		boolean endsWith =s.endsWith("class");
		System.out.println(endsWith);
		
		//to change the string into uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//to find the index positionof particular value
		int indexOf = s.indexOf('c');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('c');
		System.out.println(lastIndexOf);
		
		//to find the value from index position
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//to check whether the value is present or not
		boolean contains = s.contains("j");
		System.out.println(contains);
		
		//to replace the value of string
		String replace = s.replace('s', '#');
		System.out.println(replace);
		
		String q = s.replaceAll("java", "selenium");
		System.out.println(q);
		
		//to get the particular portion from the index
		String substring = s.substring(3);
		System.out.println(substring);
		
		String substring2 = s.substring(3, 21);
		System.out.println(substring2);
		
		//concat
		String s1="welcome to java classes in sla";
		System.out.println(s1);
		String concat = s.concat(s1);
		System.out.println(concat);
		
		//trim
		String trim = s1.trim();
		System.out.println(trim);
		
		//to check whether both string equals or not with case
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		//without cae
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
	}

}
