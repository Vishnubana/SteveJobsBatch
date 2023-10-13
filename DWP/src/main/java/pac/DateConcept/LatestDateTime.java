package pac.DateConcept;

import java.time.LocalDate;
import java.time.LocalTime;

public class LatestDateTime {
	
	LocalDate date1() {	
		return LocalDate.now();
	}
	LocalTime date2() {
		return LocalTime.now();	
	}
	LocalTime date3() {
		return LocalTime.of(22, 15, 36);		
	}
	
	LocalDate date4() {
		return LocalDate.of(2001,10, 7);
	}

}

