package login;

public class SBIBank extends ICICIBank{

	@Override
	public void savings() {
		System.out.println("5%");
		
	}

	@Override
	public void deposits() {
		System.out.println("7%");
		
	}
	public static void main(String[] args) {
		SBIBank s = new SBIBank();
		s.deposits();
		s.fixed();
		s.savings();
	}
	
	

}
