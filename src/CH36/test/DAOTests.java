package CH36.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dao.BookDAOImpl;
import CH36.Domain.Common.Dto.BookDTO;

class DAOTests {

	@Test
	void BookDAOConnect() throws ClassNotFoundException, SQLException {
		BookDAOImpl dao = BookDAOImpl.getInstance();

	}
	
	@Test
	void BookDAOSelect() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.select(1);

	    List<BookDTO> result = dao.select(1);
	    System.out.println(result.size());

	}

	@Test
	void BookDAOInsert() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.insert(new BookDTO(1, "이것이리눅스다", "한빛미디어", "111-111"));
	}

	@Test
	void BookDAOUpdate() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.update(new BookDTO(1, "이것은자바", "ㅇㅅㅇ", "111-1"));
	}

	@Test
	void BookDAODelete() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.delete(new BookDTO(1));
	}

}
