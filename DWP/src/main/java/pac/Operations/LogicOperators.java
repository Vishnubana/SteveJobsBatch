package pac.Operations;

public class LogicOperators {
	
void andLogicOperator(int age,String ticket) {
		
		if(age>18 && ticket=="Confirmed")
			System.out.println("Please Enter");
	}
	
	void orLogicOperator(String subscription,String ticket) {
		
		if(subscription=="VIP" || ticket=="VIP")
			System.out.println("Please Enter through the VIP Gate");
	}

	void notLogicOperator(int lotteryNumber) {
		
		if(lotteryNumber!=567898765)
			System.out.println("Sorry, You Have Not Won The Lottery");
	}

}
