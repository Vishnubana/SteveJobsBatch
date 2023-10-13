package pac.ConstructorConcept;

public class PrivateConstructorMain {
	public static void main(String[] args) {
	
	ConstructorPrivate constructorPrivate = ConstructorPrivate.getInstance();
	ConstructorPrivate constructorPrivate1 = ConstructorPrivate.getInstance();
	
	System.out.println(constructorPrivate.a);
	System.out.println(constructorPrivate1.a);
	
	}
	
	
}
