package method;



public class method_1 {

	// 파이썬 에서의 함수
	// [access modifier] [return type] [method Name](Parameter Type1 ParameterName1...) {
	//	method body
	//  method can declare local variable 
	//}
	//
	// why should i use Method 
	// 1) reusable
	// 2) 
	// Method의 구성 요소
	// 1) Modifier 다른 패키지나 클래스로부터의 접근을 제어한다.
	// public은 그냥 낭낭하게 제약없이 다쓸 수 있다고 생각하면된다 .
	// 
	// Access Level을 자바에서는 4가지로 분류한다.
	// private 같은 클래스내에서만 접근가능하다.
	// default는 같은 패키지내에서 접근 가능하다.
	// protected는 자식클래스에서 접근 가능하다. 
	// public을 쓰면 import만 하면 무조건 갖다가 쓸수 있따.
	//
	
	// 2)Return Type primitive Type도 되고 객체도된다.
	// 아무것도 리턴하기 싫으면 void로 작성
	
	// 3) 함수 이름 동사로 지으시고 명사는 뒤에 붙이세요 Camel Case 
	
	// 4) parameter : Method 내에서 쓰이는 값 
	// ,(콤마)로 구분하고 파라미터를 여러개 받을 수 있다.
	
	// 5) An exception list—to be discussed later.
	
	// 6) Method Body if 문이나 for 문 처럼 {}
	// 대괄호 안에 작성하세요
	// Local Variable 즉 메소드 내에서 변수를 선언할 수 있습니다.
	
	// 
	
	
	public static int add(int x, int y) {
		
		return x + y;
	}
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	// Method 사용법
	// 리턴타입 받을 변수명 = 함수이름(파라미터1,파라미터2 없으면 안적기);
	public static void main(String[] args) {
		int result = add(4235,34);
	}

}
