package bt4;

public class Book {
	private String isbn;
	private String bookName;
	private String author;
	private String publiher;
	private float price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String bookName, String author, String publiher, float price) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.publiher = publiher;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubliher() {
		return publiher;
	}

	public void setPubliher(String publiher) {
		this.publiher = publiher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "Book. isbn=" + this.isbn + " - bookName=" + this.bookName + " - author=" + this.author + " - publisher="
				+ this.publiher + " - price=" + this.price;
	}
}
