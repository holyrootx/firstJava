package objectMore;


public class BlockAndScope {

	public static void main(String[] args) {
		// Block Scope는 Java에서 중괄호 {}로 정의된 코드 블록 내에서 선언된 변수들이 
		// 그 블록 안에서만 유효하다는 개념을 말합니다. 변수의 유효 범위(scope)를 파악하는 것이 중요합니다.
		// 변수나 객체가 선언된 블록 {} 안에서만 접근 가능하고, 해당 블록 밖에서는 사용할 수 없는 범위를 의미합니다.  
		//  for문안에서 선언하고 사용했던 변수를 밖에서 사용할 수 없었던 경험이 있으신가요?
		// 바로 Block Scope 때문입니다.
		
		// 아래처럼 대괄호 없이 선언된 변수 local Variable이라고 합니다.
		// 메인메서드 어디에서나 사용이 가능합니다.
		
		// BLOCK SCOPE :
		// 2가지만 기억합시다.
		// 1) 안에서 만든건 안에서만 사용 가능
		// 2) 밖에서는 안을 못보고 안에서는 밖을 볼 수 있다.
		
		int x = 22;
		System.out.println(x);
		{
			x = 1; // 안에서는 밖을 볼 수 있다.
			int y = 1;
			System.out.println(x);
			System.out.println(y);
		}
		 // System.out.println(y); // 오류 발생
		System.out.println(x); // x 값이 변경된 것 까지 확인 가능
		
	}

}
