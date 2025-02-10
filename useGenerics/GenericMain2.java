package useGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List<Integer>와 List<Number>의 관계는 없다.
		// 
		// 근본적으로 생각 해보면 List<Integer>는 List<Number>를 상속받는 것이 아니다.
		// 둘의 공통조상은 Object다.
		// 
		// List<Number> 와 List<Integer>의 공통조상은 List<?>이다.
		// Bounded WildCard로 제네릭 타입간의 관계를 형성할 수 있다.
		// 
		// List<? extends Number> -> List<? extend Integer> -> List<Integer>
		// List<? super Integer> -> List<? super Number> -> List<Number>
		// List<? extends Number> <- List<Number>
		// List<Integer> -> List< ? super Integer>
		
		
		List<Integer> onlyIntList = new ArrayList<>();
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;  // ✅ OK!!!!!!!!!!
		
		
		System.out.println(numList);
		

	}

}
