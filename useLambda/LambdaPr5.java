package useLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPr5 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry", "blueberry");

        // ���⿡ Comparator ���ٽ��� �ۼ��ؼ� ����Ʈ�� �����ϼ���
		
        words.sort((str1,str2)->str1.length()-str2.length());

        System.out.println(words);
	}

}
