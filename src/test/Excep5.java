package test;

import java.util.ArrayList;
import java.util.List;

public class Excep5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		Integer integer = l.get(10);
		System.out.println(integer);
		

	}

}
