package makeClass.makeLibrary;

import java.util.Arrays;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] users = {null};
		User[] newUsers = {
				new User("±è¶Òµü","1"),
				new User("±è¶Ò¶Ò","2"),
				new User("±è¶Ò¶Ò¶Ò","3")
		};
		
		
		System.out.println(users.length);
		int[] sss = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(sss.length); // 10
		int[] newArray = Arrays.copyOf(sss, sss.length+1);
		System.out.println(Arrays.toString(newArray));
		
		Library library = new Library();
		library.registerUser(newUsers);
		System.out.println(Arrays.toString(library.users));
	
		
	}

}
