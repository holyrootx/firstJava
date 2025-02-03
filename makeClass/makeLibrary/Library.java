package makeClass.makeLibrary;

import java.util.Arrays;

public class Library {
	Book[] availableBooks = {null};
	User[] users = {null};
	
	public void registerUser(User user){
		if (users.length != 1) {
			int length = users.length;
			User[] expanded = Arrays.copyOf(users, length+1);
			expanded[length-1] = user;
			User[] users = expanded;
		} else {
			users[0] = user;
		}		
	}
	public void registerUser(User ... newUsers) {
		int expandedLength = newUsers.length; // È®ÀåÇÒ Ä­¼ö
		if (users.length != 1) {
			int length = users.length;
			User[] expanded = Arrays.copyOf(users, length+expandedLength);
			for(int i = length; i < length+expandedLength; i++) {
				 expanded[i] = newUsers[i - length];
			}
			User[] users = expanded;
		} else {
			users = Arrays.copyOf(newUsers,newUsers.length);
		}
	}
	
	public void addBook(Book book) {
		if (availableBooks.length != 1) {
			int length = availableBooks.length;
			Book[] expanded = Arrays.copyOf(availableBooks, length+1);
			expanded[length-1] = book;
			Book[] availableBooks = expanded;
		} else {
			availableBooks[0] = book;
		}
	}
	public void addBook(Book ... books) {
		int expandedLength = books.length; // È®ÀåÇÒ Ä­¼ö
		
		if (availableBooks.length != 1) {
			int length = availableBooks.length;
			Book[] expanded = Arrays.copyOf(availableBooks, length+expandedLength+1);
			for(int i = length; i < length+expandedLength; i++) {
				 expanded[i] = books[i - length];
			}
			Book[] availableBooks = expanded;
		} else {
			availableBooks = Arrays.copyOf(books,books.length+1);
		}
	}
}
