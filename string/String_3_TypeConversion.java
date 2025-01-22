package string;

public class String_3_TypeConversion {

	public static void main(String[] args) {
		
		
		// 다른 자료형을 문자열로 변환 하는 방법을 소개합니다..
		
		// String.valueOf()
		// 문자열로 바꿀 수 있을 법한 것들을 문자열로 변경해줍니다.
		//
		// primitive타입을 reference Type으로 활용 하기 위해서 만들어진 Wrapper 클래스에도 내장되어진 메서드입니다.
		
 		String str1 = String.valueOf(true);
		String str2 = String.valueOf(false);
		String str3 = String.valueOf(123);
		String str4 = String.valueOf(3.141592f);
		String str5 = String.valueOf(3.141592);
		String str6 = String.valueOf('c');
		String str7 = 265 + ""; // 문자열 연산은 문자열을 턴한다.
		
		System.out.println("str1 비교");
		System.out.println(str1);
		System.out.println(str1 instanceof String);
		System.out.println();
		
		System.out.println("str2 비교");
		System.out.println(str2);
		System.out.println(str2 instanceof String);
		System.out.println();
		
		System.out.println("str3 비교");
		System.out.println(str3);
		System.out.println(str3 instanceof String);
		System.out.println();
		
		System.out.println("str7 비교");
		System.out.println(str7);
		System.out.println(str7 instanceof String);
		System.out.println();
		
		// 문자열을 다른 자료형으로 변경 
		// 해당 Integer.parseInt("변경할 문자열");
		// WrapperClass.해당클래스의 paserSomthing(변경할 문자);
		// 이렇게 쓰입니다.
		
		byte byteStr = Byte.parseByte(str3);
		double doubleStr = Double.parseDouble(str5);

		System.out.println(byteStr);
		// primitive Type Type Checking
		System.out.println("Type of num: " + ((Object) byteStr).getClass().getName());
		
		System.out.println(doubleStr);
		// primitive Type Type Checking
		System.out.println("Type of num: " + ((Object) doubleStr).getClass().getName());
		
		// byte 범위나 타입에 해당되지 않는 값이 들어가는 경우 
		// 런타임 즉 실행하는 시간에 오류가 발생합니다.
		// 유의하여 사용하도록 합시다.
		
		
		
		
		

		
		
		
		// 
		

	}

}
