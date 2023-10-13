package pac.IfConditionConcept;

public class IfConditionClass {

	public static void main(String[] args) {

		entry_Validation();
	}

	static void entry_Validation() {
		String Ticket = "Checked", Drunk = "No", Child = "Not Available", Parent = "Available";
		int Age = 23, TicketNo = 55;

		if (Ticket == "Checked") {
			if (Age >= 18) {
				if (Drunk == "No") {
					if (Child == "Available") {
						System.out.println("Procced to Gate 4");
					} else {
						if (TicketNo <= 50) {
							System.out.println("Procced to Gate 1");
						} else if (TicketNo <= 100 && TicketNo >= 51) {
							System.out.println("Proceed to Gate 2");
						} else if (TicketNo <= 150 && TicketNo >= 200) {
							System.out.println("Proceed to Gate 3");
						}
					}

				}
			} else {
				if (Parent == "Available") {
					System.out.println("Please direct to 'Parent Ticket Verification'");
				}
			}

		}

	}
}