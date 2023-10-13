package pac.NineProgramsJAVA;

public class CharacterCounting {
	public static void main(String[] args)
	{
		count("Hello I am Vishnu");
	}
	
	static void count(String givenString)
	{
		// String to Character
		char[] stringChar = givenString.toCharArray();
		for (int i = 0; i < stringChar.length; i++) {
			String s = "";
			// To not count space
			while (i < stringChar.length && stringChar[i] != ' ') {
				// append with String 's'
				s = s + stringChar[i];
				i++;
			}

			if (s.length() > 0)
				System.out.println(s + ":" + s.length());		
		}
	}

	
}

