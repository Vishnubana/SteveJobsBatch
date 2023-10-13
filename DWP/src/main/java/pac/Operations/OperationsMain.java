package pac.Operations;

public class OperationsMain {

	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
		RealationalOperators realationalOperators = new RealationalOperators();
		LogicOperators logicOperators = new LogicOperators();
		UnaryOperators unaryOperator = new UnaryOperators();
		TerenaryOperators terenaryOperators = new TerenaryOperators();
		
		arithmeticOperators.addNums(5, 3);
		arithmeticOperators.subNums(9, 5);
		arithmeticOperators.mulNums(5, 5);
		arithmeticOperators.divNums(25, 5);
		arithmeticOperators.modsNums(25, 5);
		
		realationalOperators.lessThanOperator(2,5);
		realationalOperators.greaterThanOperator(5,2);
		realationalOperators.lessThanOrEqualnOperator(5,5);
		realationalOperators.greaterThanOrEqualOperator(5,2);
		realationalOperators.equalOperator(9,2);
		
		logicOperators.andLogicOperator(18,"Confirmed");
		logicOperators.orLogicOperator("VIP","Confirmed");
		logicOperators.notLogicOperator(18);
		
		unaryOperator.incrementOperator(5);
		unaryOperator.decrementOperator(5);
		unaryOperator.incrementEqualsOperator(5,9);
		unaryOperator.decrementEqualsOperator(9,5);
		
		terenaryOperators.terenaryOperation();

	}

}
