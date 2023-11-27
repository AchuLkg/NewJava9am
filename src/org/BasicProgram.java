package org;

import login.Company;

public class BasicProgram {
	//business logics
	private void empName() {
		System.out.println("Kritika");
	}
	
	private void empAddress() {
		System.out.println("Chennai");
	}
	public void empId() {
		System.out.println("111");
	}
	
	public static void main(String[]args) {
		//obj creation
		//classname objname= new Classname();
		BasicProgram b = new BasicProgram();
		Company c= new Company();
		c.compLocation();
		c.compName();
		
		b.empAddress();
		b.empId();
		b.empName();
		
}

}
