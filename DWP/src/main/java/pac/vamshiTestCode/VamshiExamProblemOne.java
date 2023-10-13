package pac.vamshiTestCode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VamshiExamProblemOne {

	public static void main(String[] args) {		
		

	
		        String inputString = "12:00pm-01:00am";

		        // Split the input string into start and end times
		        String[] times = inputString.split("-");
		        String startTimeStr = times[0];
		        String endTimeStr = times[1];

		        // Define date format for parsing
		        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mma");

		        try {
		            // Parse start and end times
		            Date startTime = dateFormat.parse(startTimeStr);
		            Date endTime = dateFormat.parse(endTimeStr);

		            // Calculate the time difference in milliseconds
		            long timeDifferenceMillis = endTime.getTime() - startTime.getTime();

		            // Convert milliseconds to minutes
		            long minutesDifference = timeDifferenceMillis / (60 * 1000);

		            System.out.println("The number of minutes between " + startTimeStr + " and " + endTimeStr + " is " + minutesDifference + " minutes.");
		        } catch (ParseException e) {
		            System.err.println("Error parsing time: " + e.getMessage());
		        }
		    }
		

		
		
		

	}

