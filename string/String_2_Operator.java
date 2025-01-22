package string;

public class String_2_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열은 더하기 가능하다
		// 이어붙이기 기능임
		
		String str1 = "가위";
		String str2 = "바위";
		String str3 = "보";
		
		System.out.println(str1+str2+str3);
		
		// 문자열 더하기 정수형,실수형,문자형 은 문자열로 취급합니다.
		String str4 = "asdas";
		int intValue1 = 18;
		float floatValue1 = 18.0f;
		double doubleValue1 = 18.0;
		char charValue1 = '뷁';
		
		System.out.print(str4 + intValue1 + " : ");
		System.out.println((str4 + intValue1) instanceof String);
		//
		System.out.print(str4 + floatValue1 + " : ");
		System.out.println((str4 + floatValue1) instanceof String);
		//
		System.out.print(str4 + doubleValue1 + " : ");
		System.out.println((str4 + doubleValue1) instanceof String);
		//
		System.out.print(str4 + charValue1 + " : ");
		System.out.println((str4 + doubleValue1) instanceof String);
		
		
		// 더하기 연산 중에 문자열이 하나라도 있으면 문자열로 취급하는거 같네요
		System.out.print( "\n" +str4 + intValue1 + floatValue1 + doubleValue1 + charValue1 + "\n");
		System.out.println((str4 + intValue1 + floatValue1 + doubleValue1 + charValue1) instanceof String);
		
	}

}
