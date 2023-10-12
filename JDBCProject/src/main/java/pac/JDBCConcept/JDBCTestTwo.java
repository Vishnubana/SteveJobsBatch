package pac.JDBCConcept;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTestTwo {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null; 
		
		String dbURL = "jdbc:mysql://192.168.0.134:3306/codebegun";
		String userName = "root";
		String userPassword = "Bana59$";
		
		String queryInsert = "insert into student_info(studentId,studentName,studentMobileNumber,studentEmail,studentGender,"
				+ "studentDOB,studentYearOfJoining,courseId,studentBloodGroup,studentYearOfCourseCompletion)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			connection = DriverManager.getConnection(dbURL, userName, userPassword);
			preparedStatement = connection.prepareStatement(queryInsert);
					
			preparedStatement.setString(1,"VamshiStdId");
			preparedStatement.setString(2,"Vamsi");
			preparedStatement.setLong(3,7385456563l);
			preparedStatement.setString(4,"Vamsi@gmail.com");
			preparedStatement.setString(5,"M");
			preparedStatement.setString(6,"2002-10-10");
			preparedStatement.setInt(7,2019);
			preparedStatement.setInt(8,601);
			preparedStatement.setString(9,"A+");
			preparedStatement.setInt(10,2023);		
			
			int resultInsert = preparedStatement.executeUpdate();
			System.out.println(": "+resultInsert);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			connection.close();
			preparedStatement.close();
			
		}
		

	}

}
