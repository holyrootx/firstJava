package useStream;

import java.util.Arrays;

public class UseStream1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		// intConsumer는 Int형 인자를 받아서 내부적으로 처리함 리턴값 없는 걸로 기억함
		
		Arrays.stream(arr).forEach(elem -> System.out.println(elem));
		
		Arrays.stream(arr).forEach(System.out::println);
		
		// 스트림 자료를 일관성있게 처리함
		// int 배열이든, Double 배열이든, 같은 방식으로 메서드를 호출하여 처리하도록함
		// 스트림 생성 -> 중간 연산 -> 최종 연산 방향으로 진행함.
		
		// 중간 연산
		// filter() 조건을 넣고 조건에 맞는 참인 경우만 추출
		// intPridicate 인트형 받아서 boolean return 함
		Arrays.stream(arr).
				filter((i) -> i % 2 == 0 ? true : false).
				forEach(System.out::println);
		// 중간 연산 
		// map() 보통 출력하는 경우로 쓰인다고함
		// UnaryOperator 하나 받아서 똑같은 타입 반환 했던거 같다.
		Arrays.stream(arr).
				map(i->i*i).
				forEach(System.out::println);
		
		// 최종 연산
		// 최종 연산 중 하나 밖에 못써요
		// 왜냐하면 최종 연산이라는 것은 스트림에서 
		// 데이터들을 모두 소모하면서 연산을 수행하기 때문에
		// 최종 연산 이후로는 스트림을 다시 생성하여 사용해야합니다.
		// 그래서 최종 연산 이후로 연산을 하려고해도 못합니다.
		// 최종 연산의 종류는 forEach(), count(), sum() reduce()가 있다.
		Arrays.stream(arr).
				map(i->i*i).
				forEach(System.out::println);

		int sum = Arrays.stream(arr).
						map(i->i*i).sum();
		
		System.out.println(sum);
		
		// 
		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);
		
		
		
	}

}
