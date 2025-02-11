package useLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class LambdaPr6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 여기에 람다식 + Stream API 활용
		// R apply(T t);
        int result = numbers.stream().
        		filter(i -> i % 2== 0).
        		mapToInt(t -> t*t).
        		sum();
        System.out.println(result);
	}

}
