package pac.VinodBroFight;

public class MainCallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NormalMethod normalMethod = new NormalMethod();
		try {
		normalMethod.m1(0);
		}catch(Exception e) {
			System.out.println("Hello");
		}
	}

}
