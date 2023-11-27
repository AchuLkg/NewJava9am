package login;
//partial abs
public abstract class ICICIBank {
	
	//abs mth
	public abstract void savings();
	public abstract void deposits();
	
	//non abs mth
	public void fixed() {
		System.out.println("7%");
	}

}
