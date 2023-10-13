package pac.ConditionsConcept;

public class IfConditionMain {

	public static void main(String[] args) {
		IfConditionMain ifConditionMain = new IfConditionMain();
		
		ifConditionMain.generalIfCondition(17);
		ifConditionMain.generalIfElseCondition(23);
		ifConditionMain.generalIfElseifCondition(101);
		ifConditionMain.generalIfElseifElseCondition(23);

	}
void generalIfCondition(int age) {
		
		if (age<18) {
			System.out.println("Under Aged");
		}
}
		
	void generalIfElseCondition(int age) {
		
		if (age<18) {
			System.out.println("Under Aged");
		}
		else {
			System.out.println("Age Verified! Please Enter!");
		}
	}

	
	void generalIfElseifCondition(int age) {
		if (age<18) {
			System.out.println("Under Aged!");
		}
		else if (age>100){
			System.out.println("Please Visit The Special Entry!");
		}
	}
	void generalIfElseifElseCondition(int age) {
		if(age<18) {
			System.out.println("under Aged!");
		}
		else if(age>100) {
			System.out.println("Please Visit The Special Entry!");
		}
		else {
			System.out.println("Age Verified! Please Enter!");
		}
	}

}
