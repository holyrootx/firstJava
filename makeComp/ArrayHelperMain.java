package makeComp;

import java.util.Arrays;

public class ArrayHelperMain {

	public static void main(String[] args) {
		
		Number[] numbers = {
			Integer.valueOf(0),1,2,3,
			4.5,5.55555f,6.66666d,7.77777,
			8,99999.101010,11.11111f,12.121212d,
			133333,14444,155555.31d,16623
		};
		
		Integer[] integers = {
				Integer.valueOf(523),Integer.valueOf(1),
				Integer.valueOf(1223),Integer.valueOf(1),
				Integer.valueOf(1)};
		ArraysHelper<Integer> intArr = new ArraysHelper<>(integers);
		
		ArraysHelper<Number> aH = new ArraysHelper<>(numbers);
		
		try {
			Number[] n = intArr.swapArray(0, 2);
			System.out.println(Arrays.toString(n));
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
