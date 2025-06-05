package DB;

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "1234");
			
			String insertSQL = "REPLACE INTO STUDENTS (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			
			Object[][] students = {
					{3384, "vamsi"},
					{3367, "Saketh"},
					{3354, "Praveen"},
					{3365, "Kushal"},
					{3393, "Vishnu"}
			};
			
			for(Object[] student: students) {
				pstmt.setInt(1,  (int) student[0]);
				pstmt.setString(2, (String) student[1]);
				pstmt.executeUpdate();			
			}
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			
			System.out.println("Student List: ");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			
			con.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
