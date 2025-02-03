package makeClass.makeBook;

public class Book {
	private static int bookCount=0;
	private String title;
	private String author;
	private double price;
	private String isbn;
	
	public Book(String isbn) {
		super();
		++bookCount;
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
		this.isbn = isbn;
	}

	public Book(String title, double price, String isbn) {
		super();
		++bookCount;
		this.title = title;
		this.author = "Unknown";
		this.price = price;
		this.isbn = isbn;
	}
	public Book(String title,String author, double price, String isbn) {
		super();
		++bookCount;
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	
	public void applyDiscount(double percent) {
		System.out.printf("After discount:Book[Title = %s, Author = %s, Price = %.2f¿ø ISBN = %s]",
				title,author,price - price * percent,isbn);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if( isbn == null || other.isbn == null)
			return false;
		if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book[Title = %s, Author = %s, Price = %.2f¿ø ISBN = %s]"
				.formatted(title,author,price,isbn);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public static void getBookCount() {
		System.out.printf("Total books created: %d%n",bookCount);
	}
	
	
	
}
