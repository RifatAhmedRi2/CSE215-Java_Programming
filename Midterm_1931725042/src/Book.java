import java.util.Date;

public class Book {
	private String author;
	private String title;
	private int isbn;
	private Date datestored;
	private int numberOfPages;
	
	public Book() {
		super();
	}
	
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Date getDatestored() {
		return datestored;
	}
	
	public void BorrowBook(String title) {
		
	}
	
	public void ReturnBook(String title) {
		
	}
	
}
