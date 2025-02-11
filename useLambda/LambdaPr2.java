package useLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Ʈ���� ¦���� ���͸��ؼ� ����ϴ� ���ٽ� �����
		//
		List<Integer> intList = new ArrayList<>();
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Predicate boolean test(T t);
		numbers.stream().
			filter(i -> i % 2 == 0).
			forEach(i->System.out.println(i));
		
		// ���ڿ� ����Ʈ���� ���̰� 5 �̻��� �ܾ ����ϴ� ���ٽ� �����
		List<String> words = List.of("apple", "banana", "cat", "dog", "elephant");
		words.stream().filter(str->str.length() >= 5).forEach(str->System.out.println(str)); 
		// ????

		
	}

}
