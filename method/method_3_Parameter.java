package method;

import java.util.Arrays;

public class method_3_Parameter {

	// parameter로 값을 전달할 때
	// primitive Type은 값을 전달해서 
	// 안에서 뭔일이 일어나든 밖에 영향을 줄 수 있는 일은 Return 밖에 없다.
	
	// 그러나...
	// Reference Type의 변수들은 영향이 있을 수 있다.
	//
	static void changeValue(int x) {
		x = 87654;
	}
	static void changeValue(int[] arrX) {
		arrX[0] = 87654;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		int[] arrX = {1,2,3,4,5,6,7,8,9,10};
		changeValue(x); 
		changeValue(arrX);
		// 영향이 없는 것 확인 
		System.out.println(x);
		
		// 영향이 있는 것 확인
		System.out.println(Arrays.toString(arrX));

	}

}
