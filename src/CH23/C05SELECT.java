package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05SELECT {
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

			pstmt = conn.prepareStatement("SELECT * FROM tbl_std");

			rs = pstmt.executeQuery();

			if (rs != null) {
				
				while (rs.next()) {
					System.out.println(rs.getString(1) + "" );
					System.out.println(rs.getInt(2) + "" );
					System.out.println(rs.getString(3) + "" );
					System.out.println();
				}
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
