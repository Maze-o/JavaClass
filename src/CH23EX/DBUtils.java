package CH23EX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	
	public static void Select() throws Exception {
		
	}
	
	public static void main(String[] args) {
		String driver = "org.mariadb.jdbc.Driver";
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mariadb://localhost:3306/testdb";
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,id,pw);
			
			// insert
//			pst = con.prepareStatement("INSERT INTO testtable VALUES (?)");
//			pst.setInt(1, 12313);
			
			// update 
//			pst = con.prepareStatement("UPDATE testtable SET 우편번호=? WHERE 순번=?");
//			pst.setInt(1, 231231231);
//			pst.setInt(2, 1);
			
			// DELETE
//			pst = con.prepareStatement("DELETE FROM testtable WHERE 순번=?");
//			pst.setInt(1, 1);
			
			// SELECT 
			pst = con.prepareStatement("SELECT * FROM testtable WHERE 순번=?");
			pst.setInt(1, 3);
			rst = pst.executeQuery();
			
			if (rst != null) {
				while(rst.next()) {
					System.out.println(rst.getInt(1) + "");
					System.out.println(rst.getString(2) + "");
					System.out.println(rst.getString(3) + "");
					System.out.println(rst.getString(4) + "");
					System.out.println(rst.getInt(5) + "");
					System.out.println(rst.getString(6) + "");
					
					
				}
			}
			
			int t = pst.executeUpdate();
			
			if (t > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
			System.out.println("DB연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
