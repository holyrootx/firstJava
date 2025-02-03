package makeClass.makeLibrary;

public class User {
	String name;
	String userId;
	Book[] borrwedBooks;
	
	User(String name, String userId){
		this.name = name;
		this.userId = userId;
	}
	public void borrowBook(Book ... book) {
		
	}
	public void returnBook(Book ... book) {
		
	}
}
