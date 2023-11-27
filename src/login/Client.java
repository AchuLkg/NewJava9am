package login;
import org.Company;
import org.Employee;
public class Client extends Company {
	
	
	public void clientName() {
		System.out.println("CCC");
	}

	public static void main(String[] args) {
		Client c =new Client();
		c.clientName();
		c.compName();
		c.empName();
		
		

	}

}
