package com.main;

public class OperatorsClass {

	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
		RealationalOperators realationalOperators = new RealationalOperators();
		LogicalOperator logicalOperator = new LogicalOperator();
		UnaryOperator unaryOperator = new UnaryOperator();
		TerenaryOperator terenaryOperator = new TerenaryOperator();
		
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
		
		logicalOperator.andLogicOperator(18,"Confirmed");
		logicalOperator.orLogicOperator("VIP","Confirmed");
		logicalOperator.notLogicOperator(18);
		
		unaryOperator.incrementOperator(5);
		unaryOperator.decrementOperator(5);
		unaryOperator.incrementEqualsOperator(5,9);
		unaryOperator.decrementEqualsOperator(9,5);
		
		terenaryOperator.terenaryOperation(18);
		
		
		
		
		
		
		

	}

}
