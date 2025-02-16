package makeHierarchy;

import java.util.Arrays;

public class CloseToIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers = {10,554,3436,646,4554,3435,453,23,
				131,66,26,373,735,364,7575,76,
				7647,435,5345,525,435,6,4564,65,
				6,6,34,553,62,254,534,53,6,
				3635,576,7,8,97,987,987,97,
				97,86,7,756,746,745,366,43,578,534};
		
		System.out.println(Arrays.toString(numbers));;
		System.out.println();
		Arrays.sort(numbers,new CloseToInt(65));
		
		System.out.println(Arrays.toString(numbers));;
		
		Integer int1 = Integer.valueOf(7);
		Integer int2 = Integer.valueOf(1);
		Integer int3 = Integer.valueOf(545);
		int a = int1.compareTo(int2);
		int b = int1.compareTo(int3);
		int c = int2.compareTo(int3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Arrays.sort(numbers, new CloseToInt(400));
		for (Integer num : numbers) {
			System.out.print(num + ", ");
		}
		
	}

}
