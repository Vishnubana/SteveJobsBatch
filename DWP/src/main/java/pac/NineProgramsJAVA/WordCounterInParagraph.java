package pac.NineProgramsJAVA;

public class WordCounterInParagraph {

	public static void main(String[] args) {
		wordCounterMethod("Hello I am Vishnu");
	}
	static void wordCounterMethod(String str) {
		int i = 0,wordCount = 1;
		int strLength = str.length();
		if(strLength == 0) {
			System.out.println("The total number of words are 0!");
		}
		else {
		while(i<strLength) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) !=' ') {
				wordCount +=1;
			}
			i++;
		}
		System.out.println("The total number of words are "+wordCount+"!");
	}
	}

}
