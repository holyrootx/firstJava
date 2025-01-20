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
		
	}

}
