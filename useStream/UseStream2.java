package useStream;

import java.util.Arrays;

public class UseStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T- Reduce (T identify, BinarayOperator<T> accmulator)
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum = Arrays.stream(arr).reduce(0,(a,b)-> a + b);
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		// 초기값 + 전달되는 요소 -> 요소끼리하는 기능
	}

}
