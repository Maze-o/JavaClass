package CH36.Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CH36.Domain.Common.Dto.BookDTO;

public class BookDAOImpl {

	// DBCONN 속성 (MariaDB연결)
	private String driver = "org.mariadb.jdbc.Driver";
	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mariadb://localhost:3306/bookDB";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글톤패턴
	private BookDAOImpl() throws SQLException, ClassNotFoundException {

		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("BookDAOImpl DB Connection Success");

	};

	private static BookDAOImpl instance = null;

	// getInstance()함수를 통해 객체를 하나만 생성할 수 있게 함
	public static BookDAOImpl getInstance() throws SQLException, ClassNotFoundException {
		if (instance == null) {
			instance = new BookDAOImpl();
		}

		return instance;
	}

	public List<BookDTO> select() {
		return null;
	}

	public List<BookDTO> select(int bookCode) throws Exception {
		pstmt = conn.prepareStatement("SELECT * FROM tbl_book WHERE bookCode = ? ");
		pstmt.setInt(1, bookCode);
		ResultSet rs = pstmt.executeQuery();
		List<BookDTO> booklist = new ArrayList<>();

		while (rs.next()) {
			BookDTO book = new BookDTO();
			book.setBookCode(rs.getInt("bookCode"));
			book.setBookName(rs.getString("bookName"));
			book.setPublisher(rs.getString("publisher"));
			book.setIsbn(rs.getString("isbn"));
			booklist.add(book);
		}
		pstmt.close();
		return booklist;
	}

	public int insert(BookDTO dto) throws SQLException {
		pstmt = conn.prepareStatement("INSERT INTO tbl_book VALUES (?, ?, ?, ?)");
		pstmt.setInt(1, dto.getBookCode());
		pstmt.setString(2, dto.getBookName());
		pstmt.setString(3, dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	public int update(BookDTO dto) throws SQLException {
		pstmt = conn.prepareStatement("UPDATE tbl_book SET bookName = ?, publisher = ?, isbn = ? WHERE bookCode = ? ");
		pstmt.setString(1, dto.getBookName());
		pstmt.setString(2, dto.getPublisher());
		pstmt.setString(3, dto.getIsbn());
		pstmt.setInt(4, dto.getBookCode());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	public int delete(BookDTO dto) throws SQLException {
		pstmt = conn.prepareStatement("DELETE FROM tbl_book WHERE bookCode = ? ");
		pstmt.setInt(1, dto.getBookCode());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

}
