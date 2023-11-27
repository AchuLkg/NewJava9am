package login;

public class LocalVaraible {

	
		 void sample() {
			//local var
			int a=100;
			System.out.println("a in method:"+a);
			
		}
		
		public static void main(String[] args) {
			int a=200;
			System.out.println("a is in main mthd:"+a);
			LocalVaraible l = new LocalVaraible();
			l.sample();
			
			
	}

}
