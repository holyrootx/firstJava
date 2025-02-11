package useLambda;

import java.util.Arrays;
import java.util.List;

public class LambdaPr7 {

	public static void main(String[] args) {
		// �־��� ����Ʈ���� ù ���ڰ� "A"�� �����ϴ� �ܾ ���͸��� ��, 
		// ��� �ܾ �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���ٽ��� �ۼ��ϼ���.
		
		List<String> words = Arrays.asList("Apple", "banana", "Avocado", "cherry", "Apricot");

        // ���⿡ ���ٽ� + Stream API Ȱ��
        words.stream().
        filter(str->str.startsWith("A")).
        map(String::toUpperCase).
        forEach(System.out::println);

	}

}
