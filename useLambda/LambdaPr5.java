package useLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPr5 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry", "blueberry");

        // 여기에 Comparator 람다식을 작성해서 리스트를 정렬하세요
		
        words.sort((str1,str2)->str1.length()-str2.length());

        System.out.println(words);
	}

}
