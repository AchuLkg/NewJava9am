package login;

public class Hospital {
	
	public void hosDetails(String name) {
		System.out.println("Hospital name:"+"uuu");
	}
	//arguments depends on datatype count(4)
	public void hosDetails(float empSalary,int pinNo,long accountNo,char empGender) {
		System.out.println("Employee salary"+empSalary+"\n"+"Employee pin no:"+pinNo+
				"\n"+"Employee ph no:"+accountNo+"\n"+"Employee gender:"+empGender);
	}
	//datatype order
	public void hosDetails(boolean empMarSta,double empRent) {
		System.out.println("Employee mar sta :"+empMarSta+"\n"+"Employee rent:"+empRent);
	}
	//ghjgjh(double,boolean)
	
	public static void main(String[] args) {
		Hospital h=new Hospital();
		h.hosDetails("AAA");
		h.hosDetails(true, 2000.45457896);
		h.hosDetails(30000.21345f, 1245, 123456789656l, 'F');
	}
	

}
