package pac.JDBCConcept;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTestFour {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null; 
		
		String dbURL = "jdbc:mysql://192.168.0.134:3306/codebegun";
		String userName = "root";
		String userPassword = "Bana59$";

		
		String queryDelete = "delete from student_info where studentInfoId = 907";
		
		try {
			connection = DriverManager.getConnection(dbURL, userName, userPassword);
			preparedStatement = connection.prepareStatement(queryDelete);
		
			
			int resultDelete = preparedStatement.executeUpdate();
			System.out.println(": "+resultDelete);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			connection.close();
			preparedStatement.close();
			
		}
		

	}

}
