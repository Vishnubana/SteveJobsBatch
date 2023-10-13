package pac.NineProgramsJAVA;

public class pangramChecking {

	public static void main(String[] args) {


	}
	String mainString = "asdfghjklqwertyuiopzxcvbnm";
	
	void pangramCheckMethod() {
//		Converting String to LowerCase
		mainString = mainString.toLowerCase();
//		for Loop to check if all the characters are i
		for(int i=0;i<mainString.length();i++) {
			if(i>='a'&&i<='z') {
				System.out.println("The given String is a Pangram");
			}
		}
	}

}
