package com.main;

class RealationalOperators {
	
	void lessThanOperator(int a,int b) {
		if(a<b)
			System.out.println(a +"is less than" + b);
		else
			System.out.println(a +"is not less than" + b);
	}
	
	void greaterThanOperator(int a,int b) {
		if(a>b)
			System.out.println(a +"is greater than" + b);
		else
			System.out.println(a +"is not greater than" + b);
	}
	
	void lessThanOrEqualnOperator(int a,int b) {
		if(a<=b)
			System.out.println(a +"is less than or equal to" + b);
		else
			System.out.println(a +"is not less than or equal to" + b);
	}
	
	void greaterThanOrEqualOperator(int a,int b) {
		if(a>=b)
			System.out.println(a +"is greater than or equal to" + b);
		else
			System.out.println(a +"is not greater than or equal to" + b);
	}
	
	void equalOperator(int a,int b) {
		if(a==b)
			System.out.println(a +"is equal to " + b);
		else
			System.out.println(a +"is not equal to" + b);
	}

}
