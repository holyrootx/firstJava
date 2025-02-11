package useLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class useLambdaMain1 {

	public static void main(String[] args) {
		
		Usable u = a -> System.out.println(a);

		u.use("깍두기");
		
		// List로 lambda 활용해서 하나씩 출력하기
		ArrayList<String> myList = new ArrayList<>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		myList.add("7");
		myList.add("8");
		
		// void accept(T t);
		// consumer 
		myList.forEach(i -> System.out.println(i));

		Map<String,String> myMap = new HashMap<>();
		myMap.put("1", "a");
		myMap.put("2", "b");
		myMap.put("3", "c");
		// BiConsumer void accept(T t, U u);
		myMap.forEach((key,value) -> System.out.printf("key : %s value : %s %n",key,value));
		
	}

}
