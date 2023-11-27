package login;
//child class
public class Company   {
	
	public void compName() {
		System.out.println("CTS");
		
	
	}
	public void compLocation() {
		System.out.println("Chennai");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.compLocation()
		;c.compName();
		Employee e = new Employee();
		e.empId();
		
	}

}
