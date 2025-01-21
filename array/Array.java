package array;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		// 배열 비슷한 값 여러개 담기
		// 선언 방법
		// String[] arrayName = {"","","","",""}; // 하나씩 다 넣어주기
		
		// 선언 -> 칸생성 -> 초기화 과정 거쳐야함!
		
		// 선언
		int[] arr;  // 권장 방식

		// 배열의 칸 생성
		arr = new int[5];  // 크기가 5인 배열 생성
		

		// 선언과 동시에 생성 
		int[] arr2 = new int[5];  // 크기가 5인 int 배열 생성

		// 선언 생성 초기화 동시 진행 
		int[] arr3 = {1, 2, 3, 4, 5};  // 크기가 5이고 초기값을 가지는 배열

		// 배열의 크기 확인 배열.length속성
		System.out.println(arr3.length);
		
		int[] arr4 = {10, 20, 30, 40, 50};

		// 전통적인 for문
		// for (int i = 0; i < arr4.length; i++) {
		//     System.out.println(arr4[i]);
		// }
		
		System.out.println("------------------------------------------");

		// 배열 순회
		// 향상된 for문 (Enhanced for loop)
		// forEach
		for (int num : arr4) {
		    System.out.println(num);
		}
		
		// 배열 복사
		int[] arrA= {10, 20, 30, 40, 50};

		int[] arrB = new int[arrA.length * 2]; // 우선 초기 배열보다 길이가 두배인 새로운 배열을 선언
		for(int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		 
		arrB[3] = 21312;
		
		System.out.println(Arrays.toString(arrB));;
		System.out.println(Arrays.toString(arrA));;
		
		arrB = Arrays.copyOf(arrA,arrA.length);
		System.out.println(Arrays.toString(arrB));
		
		String[] myArrayStr = {"강","김","정","조"};
		String[] myArrayStr2 = {"강","김","정","조"};
		// Arrays 클래스 
		// 
		// toString(배열); // 배열에 저장된 내용을 문자열로 바꿔서 보여줌 
		
		System.out.println(Arrays.toString(myArrayStr));
		
		// Arrays.equals(배열A,배열B);
		System.out.println(Arrays.equals(myArrayStr,myArrayStr2));
		
		// 배열의 복사 
		// Arrays.copyOf(배열A,범위) // 범위는 보통 배열A.length로 전체를 복사함
		// Return Value == 배열 
		// 
		// Arrays.copyOfRange(복사할배열,form,to); to는 안들어감 
		// from이 5고 to가 9면 5~8번째까지;
		// Return Value == 배열
		
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		int[] numbersCopy;
		int[] partOfNumbers;
		
		numbersCopy = Arrays.copyOf(numbers, numbers.length);
		System.out.println(Arrays.toString(numbersCopy));
		
		partOfNumbers = Arrays.copyOfRange(numbers, 0, 4);
		System.out.println(Arrays.toString(partOfNumbers));
		
		// 배열의 정렬
		// Arrays.sort(정렬할배열);
		// 오름 차순
		
		int[] randomNumbers = {7,5,6,8,9,3,2,1,4,0};
		Arrays.sort(randomNumbers);
		System.out.println(Arrays.toString(randomNumbers));
		
		
		
		// 배열의 복사와 관련 
		// 원시 자료형은 값 자체를 복사한다.
		// 
		// 배열은? 
		// Reference Type이다..
		// 
		
		Boolean[] bools1 = {true,true,true};
		Boolean[] bools2 = {false,false,false};
		
		bools1 =bools2;
		System.out.println(Arrays.toString(bools1));
		System.out.println(Arrays.toString(bools2));
		
		// boos2의 주소값이 bools1에 들어가서 
		// 값도 같이 들어가진 모습.
		// 그러나...
		// bools2의 값을 변경해주었더니..
		// bools1의 값도 바뀌었다.
		// 서로 주소를 공유하기 때문이다.
		// 동기화되었기 때문에 1에서 값을 변경해도 2와 같이 반영이 될 것이다.
		
		// 그렇다면 동기화 시키지않고 값을 복사하고 싶으면 어떻게 해야할까
		// 배열를 순회하여 값을 하나씩 복사해야 한다.
		// 값은 primitive 타입이고 primitive타입은 Stack Memory에 
		// 값을 저장하기 때문이다.
		// 그러나...
		// 내부에도 객체가 있다면 ...?
		// 아직은 모르겠네요
		bools2[0] = true;
		System.out.println(Arrays.toString(bools1));
		System.out.println(Arrays.toString(bools2));
		
		
		// 배열은 특수한 방법으로 복사해야한다..
		// Method 사용하세요 그냥
		
		// 
		
	}

}
