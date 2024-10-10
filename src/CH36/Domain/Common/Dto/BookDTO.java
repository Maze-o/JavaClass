package CH36.Domain.Common.Dto;

public class BookDTO {
	private int bookCode;
	private String bookName;
	private String publisher;
	private String isbn;

	public BookDTO() {
		super();
	}
	
	public BookDTO(int bookCode) {
		this.bookCode = bookCode;
	}

	public BookDTO(int bookCode, String bookName, String publisher, String isbn) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "BookDTO [bookCode=" + bookCode + ", bookName=" + bookName + ", publisher=" + publisher + ", isbn="
				+ isbn + "]";
	}

}
