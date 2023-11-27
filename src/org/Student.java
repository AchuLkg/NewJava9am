package org;

public class Student {
	
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(111);
		s.setStudentName("HAI");
		
		System.out.println("Student id:"+s.getStudentId()+"\n"+"Student name:"
		+s.getStudentName());
	}
	

}
