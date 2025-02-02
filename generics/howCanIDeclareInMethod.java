package generics;
import java.util.Arrays;

public class howCanIDeclareInMethod {

	
	public static void main(String[] args) {
		
		String[] strs = {"0","1","2","3","4","5","6","7","8","9"};
		Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
		System.out.printf("strs : %s%n",Arrays.toString(strs));
		System.out.printf("numbers : %s%n",Arrays.toString(numbers));
		
		swapArray(strs, 5,7);
		swapArray(numbers, 4, 8);
		System.out.printf("strs : %s%n",Arrays.toString(strs));
		System.out.printf("numbers : %s%n",Arrays.toString(numbers));

		System.out.println(Math.max(5, 8));
	}
	
	public static <T> T pickRandom(T a, T b) {
		
		
		return Math.random() > 0.5 ? a : b;
	}
		// 제네릭을 사용한다고 명시<T>
	public static <T> void swapArray(T[] array,int a, int b) {
		if (array.length <= Math.max(a, b)) return;
		T temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
