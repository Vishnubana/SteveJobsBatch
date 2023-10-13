package pac.DynamicOperatonConcept;

public class DynamicOperations {
	public static void main(String[] args) {
	
	DynamicArithmeticOperations dynamicArithmeticOperations = new DynamicArithmeticOperations();
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	
	dynamicArithmeticOperations.addNum( a,  b);
	dynamicArithmeticOperations.subNum( a,  b);
	dynamicArithmeticOperations.mulNum( a,  b);
	dynamicArithmeticOperations.divNum( a,  b);
	dynamicArithmeticOperations.modsNum( a,  b);
	
	}
	

}
