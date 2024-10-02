package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C04DELETE {
	public static void main(String[] args) {

		// DB Connect DATA
		String driver = "org.mariadb.jdbc.Driver";
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mariadb://localhost:3306/gas";

		// jdbc 참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success...");

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");

			pstmt = conn.prepareStatement("DELETE FROM tbl_std WHERE name=?");
			pstmt.setString(1, "홍길동");
			
			
			
			int result = pstmt.executeUpdate(); // DML (INSERT, UPDATE, DELETE)
			
			// 쿼리문이 문제가 있으면 0, 정상적으로 작동 하면 1
			if (result > 0) {
				System.out.println("DELETE 성공!");
				
			} else {
				System.out.println("DELETE 실패!");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

