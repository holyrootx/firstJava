package useLambda;

import java.util.Comparator;
import java.util.function.Function;
public class LambdaPr3 {

	public static void main(String[] args) {
		Comparator<Integer> comparator = (a, b) -> a-b;
		System.out.println(comparator.compare(10, 9));;
		
		// Function<String,Intger>
		//  R apply(T t);
		Function<String, Integer> lengthFunction = t -> Integer.valueOf(t.length());
		System.out.println(lengthFunction.apply("aaaaabbbbbccccc"));
		

	}

}
