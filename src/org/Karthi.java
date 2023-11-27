package org;

public class Karthi extends Surya {
	
	public void act() {
		System.out.println("Karthi is an actor");
	}

	public static void main(String[] args) {
		Karthi k = new Karthi();
		k.act();
		Sivakumar s = new Sivakumar();
		s.act();
		Surya a = new Surya();
		a.act();
		

	}

}
