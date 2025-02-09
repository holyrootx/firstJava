package generics;

import java.io.Serializable;
import java.util.ArrayList;

public class MyClassMain {

	public static void main(String[] args) {
		MyClass myC = new MyClass<Integer>("");
		Serializable s = pick("d", new ArrayList<String>());
		System.out.println(s.getClass());
		System.out.println("d".getClass());
		// String obj = pick("Hello", someMethod());
		

	}

	static <T> T pick(T a1, T a2) { return a2; }
	

	static Integer someMethod() {
	    return 42;
	}
}
