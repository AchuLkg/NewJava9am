package test;

import java.util.ArrayList;
import java.util.List;

public class Listtt {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		//to insert values
		li.add(10);//10
		li.add(20);//20
		li.add(30);//30
		li.add(40);//35
		li.add(50);//45
		li.add(10);//50,//10
		System.out.println(li);
		
		//to find size
		int size = li.size();
		System.out.println(size);
		
		//to add the element in particular index position
		li.add(3,35);
		System.out.println(li);
		
		// to replace the value in particular index position
		li.set(4, 45);
		System.out.println(li);
		
		boolean contains = li.contains(20);
		System.out.println(contains);
		
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int indexOf2 = li.indexOf(20);
		System.out.println(indexOf2);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//to remove the particualr value
		li.remove(4);
		System.out.println(li);

		//li.clear();
		//System.out.println(li);
		
		//to add values
		List<Integer> l = new ArrayList<>();
		l.addAll(li);
		System.out.println(l);
		l.add(200);
		l.add(300);
		
		System.out.println(l);
		
		//to print the uncommon values of both list
		//10,20,30,35,50,10==li
		//10,20,30,35,50,10,200,300==l
		l.removeAll(li);
		System.out.println(l);
		
		//common values
		//l--200,300
		//li==10,20,30,35,50,10
		l.retainAll(li);
		System.out.println(l);
		

	}

}
