package pac.JDBCConcept;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTestOne {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null; 
		ResultSet resultSet = null;
		
		String dbURL = "jdbc:mysql://192.168.0.134:3306/codebegun";
		String userName = "root";
		String userPassword = "Bana59$";
		String query = "select * from student_info";

		
		try {
			connection = DriverManager.getConnection(dbURL, userName, userPassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			List<UserInfo> userInfoList = new ArrayList();
			while(resultSet.next()) {
				System.out.println("Directly Printing the Columns Data: ");
				System.out.println(resultSet.getInt("studentInfoId"));
				System.out.println(resultSet.getString("studentId"));
				System.out.println(resultSet.getString("studentName"));
				System.out.println(resultSet.getLong("studentMobileNumber"));
				System.out.println(resultSet.getString("studentEmail"));
				System.out.println(resultSet.getString("studentGender"));
				System.out.println(resultSet.getDate("studentDOB"));
				System.out.println(resultSet.getInt("studentYearOfJoining"));
				System.out.println(resultSet.getString("courseId"));
				System.out.println(resultSet.getString("studentBloodGroup"));
				System.out.println(resultSet.getInt("studentYearOfCourseCompletion"));
				System.out.println("--------------------------------------");
				

				
				UserInfo userInfo = new UserInfo();

				
				userInfo.setStudentInfoId(resultSet.getInt("studentInfoId"));
				userInfo.setStudentId(resultSet.getString("studentId"));
				userInfo.setStudentName(resultSet.getString("studentName"));
				userInfo.setStudentMobileNumber(resultSet.getLong("studentMobileNumber"));
				userInfo.setStudentEmail(resultSet.getString("studentEmail"));
				userInfo.setStudentGender(resultSet.getString("studentGender"));
				userInfo.setStudentDOB(resultSet.getDate("studentDOB"));
				userInfo.setStudentYearOfJoining(resultSet.getInt("studentYearOfJoining"));
				userInfo.setCourseId(resultSet.getString("courseId"));
				userInfo.setStudentBloodGroup(resultSet.getString("studentBloodGroup"));
				userInfo.setStudentYearOfCourseCompletion(resultSet.getInt("studentYearOfCourseCompletion"));
				
				userInfoList.add(userInfo);				
			}
			System.out.println("Printing data in List: ");
			for(UserInfo userInfoVariable: userInfoList) {
				System.out.println("StudentInfoId: "+userInfoVariable.studentInfoId);
				System.out.println("StudentId: "+userInfoVariable.studentId);
				System.out.println("StudentName: "+userInfoVariable.studentName);
				System.out.println("StudentMobileNumber: "+userInfoVariable.studentMobileNumber);
				System.out.println("StudentEmail: "+userInfoVariable.studentEmail);
				System.out.println("StudentGender: "+userInfoVariable.studentGender);
				System.out.println("StudentDOB: "+userInfoVariable.studentDOB);
				System.out.println("StudentYearOfJoining: "+userInfoVariable.studentYearOfJoining);
				System.out.println("CourseId: "+userInfoVariable.courseId);
				System.out.println("StudentBloodGroup: "+userInfoVariable.studentBloodGroup);
				System.out.println("StudentYearOfCourseCompletion: "+userInfoVariable.studentYearOfCourseCompletion);
				
				System.out.println("-----");
			}
			System.out.println("ToStringList"+ userInfoList);
					
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			connection.close();
			statement.close();
			resultSet.close();
			
		}
		

	}

}
