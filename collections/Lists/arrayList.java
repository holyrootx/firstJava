package collections.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제네릭 의 타입으로써 primitive type은 오지못해서 Wrapper Class로 변경해준다.
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		ArrayList<Number> numberList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		ArrayList<Character> charList = new ArrayList<>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		System.out.println(intList);
		System.out.println(intList.size());
		// System.out.println(intList[0]); // 배열 처럼 하는 것 안됨 ㅋ
		
		// for Each 문 사용 가능
		for(Integer num: intList) {
			System.out.println(num.intValue());
		}
		
		// 요소의 개수
		System.out.println(intList.size());
		// 비어있는가?
		System.out.println(doubleList.isEmpty());
		System.out.println(intList.isEmpty());
		// 요소에 접근
		System.out.println(intList.get(3));;
		System.out.println(intList.get(4));;
		
		// 들어 있는지? 포함 하는지?
		System.out.println(intList.contains(30));
		
		// 특정 위치의 요소 수정
		intList.set(2, 324);
		System.out.println(intList);
		
		// 특정 위치에 요소 삽입
		intList.add(1, 989);
		System.out.println(intList);
		
		// 배열 처럼 생성 하자 마자 초기화 
		
		// 방법 1) 
		// Arrays.asList(Integer[] 배열 사용)
		ArrayList<Integer> intNums1 = new ArrayList<>(
				Arrays.asList(1,2,3,4,5,6,7,8,9)
				);
		ArrayList<Integer> intNums2 = new ArrayList<>(
				Arrays.asList(new Integer[] {2,3,4,5})
				);
		System.out.println(intNums1); 
		
		// 방법 2)
		// list.of()
		//
		ArrayList<Integer> intNums3 = new ArrayList<>(
				List.of(1,2,3,4,5,6,7,8,9,10)
				);
		
		//ArrayList 합치기
		Collections.addAll(intNums1, 1,2,3,4,5);
		
		// 배열 요소를 그대로 복제하여 반환
		ArrayList<Integer> intNums4 = new ArrayList<>(intNums3);
		System.out.println(intNums4);
		
		// clone 메서드 활용 얕은 복사
		ArrayList<Integer> intNums5 = (ArrayList<Integer>) intNums4.clone();
		System.out.println(intNums4);
		System.out.println(intNums5);
		
		
		// 요소 지우기
		// remove({primitive type} int) 인덱스에 해당하는 값 지움
		// remove(Class Instance) // 인스턴스에 해당하는 값이 있으면 지움제일 먼저 찾은해당하는값을 지움 
		System.out.println("========요소 지우기 ==========");
		intNums4.remove(0);
		System.out.println(intNums4);
	
		// arr1.removeAll(arr2) arr1에서 arr2와의 교집합을 빼줌
		// intNums4 [2,3,4,5,6,7,8,9,10]
		// intNums2 [2,3,4,5]
		intNums4.removeAll(intNums2);
		System.out.println(intNums4);
		
		// addAll 컬렉션 이어 붙이기
		
		
	}

}
