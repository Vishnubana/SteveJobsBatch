package pac.LoopsConcept;

public class LoopsClass {
	public static void main(String[] args) {
		forLoopMethod();
		whileLoopMethod();
	}
	
	static void forLoopMethod() {
		System.out.println("For Loop :");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void whileLoopMethod() {
		System.out.println("While Loop:");
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
	}

}
