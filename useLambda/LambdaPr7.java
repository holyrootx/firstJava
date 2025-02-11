package useLambda;

import java.util.Arrays;
import java.util.List;

public class LambdaPr7 {

	public static void main(String[] args) {
		// 주어진 리스트에서 첫 글자가 "A"로 시작하는 단어만 필터링한 후, 
		// 모든 단어를 대문자로 변환하여 출력하는 람다식을 작성하세요.
		
		List<String> words = Arrays.asList("Apple", "banana", "Avocado", "cherry", "Apricot");

        // 여기에 람다식 + Stream API 활용
        words.stream().
        filter(str->str.startsWith("A")).
        map(String::toUpperCase).
        forEach(System.out::println);

	}

}
