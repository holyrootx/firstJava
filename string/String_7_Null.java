package string;

public class String_7_Null {

	public static void main(String[] args) {
		// Null ==> 비어있다.
		// 0 ==> 0이라는 값이 있다.
		// "" ==> 

		String emptyStr = "";
		String nullStr = null;
		String notInitStr;
		boolean boo1 = emptyStr == nullStr;
		
		// Null이 들어가면
		// 객체가 메모리상에 존재하지않는다.
		// 받아올 객체 자체가 없으니 오류발생
		// NullPointerException
		// Null은 無의 상태를 의미한다.
		
		// System.out.println(nullStr.length());
		
		// 외부에서 값을 받아올 경우
		// Null Checking을 해야한다.
		// 값이 비어있는 경우도 오류인 경우가 많으니 
		// 아래 처럼 하는 것이 좋다.
		String defaultStr = (nullStr != null && !nullStr.isEmpty())
				? nullStr : "기본값";
		System.out.println(defaultStr);

		// 초기화 하지않은 것은 컴파일전에 오류가 발생하기 때문에 상관없음
		// System.out.println(notInitStr);

		// null은 Runtime에서 오류가 발생하기 때문에 주의하여야한다.
		
	}

}
