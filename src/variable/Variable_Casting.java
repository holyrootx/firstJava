package variable;

public class Variable_Casting {

	public static void main(String[] args) {
		
		// Variable Casting 형변
		// 형을 변환한다 => Type을 변환한다는 의미인데요
		// 자바에서 기본적으로는 같은 타입끼리만 연산이 가능하도록 되어있어서 
		// 연산과정에서 매끄러운 연산을 위해 타입변환에 관한 몇가지 법칙이 있습니다.
		
		// 0) 정수형 끼리의 연산은 기본적으로 int를 반환한다.
		// 1) 큰거에서 작은거로 가면 값이 손실된다.
		// 2) 작은거에서 큰거로가면 자동으로 캐스팅 된다 
		// 
		// 여기서 1번을 명시적 형변환 (Explicit Casting)
		// 2번을 자동 형변환 (Implicit Casting)
		// 이라고 부릅니다.
		// byte => short => int => long

		
		byte ba = 17;
		byte bb = 20;
		byte bc = 0;
		
		// 예시 0번 
		// 정수형 끼리의 연산은 기본적으로 int를 반환합니다.
		// 그래서 아래 ba + bb 부분이 int 를 반환하니까 byte 형태로 변경해주라는 에러 메시지가 나옵니다.
		// 오류를 피하려면 int형 변수를 만들어서 변수를 담을 통을 바꾸어 주거나 
		// 연산 부분에 ba와 bb에 각각 명시적 형변환을 해주어야 합니다. 
		
		// bc = (byte)ba + (byte)bb; // 오류 발생 어차피 연산하면 int형으로 변경되니까... 
		
		// 수동 형변환 (명시적 형변환) Explicit Casting
		bc = (byte)(ba + bb);
		int newInt = ba + bb;
		
		// 자동 형변환 (묵시적 형변환) Implicit Casting
		int ia = 27;
		byte bd = 23;
		
		// 원래는 assignment 연산이 되면 이상한 상황이지만 
		// 자바에서 매끄러운 정수형끼리의 계산을 위해서 
		// 자동으로 형변환을 해준 모습입니다.
		// 사실 casting 하는 (int) 부분이 생략되었다고 보셔도됩니다.
		// 아래 두줄 다 오류 발생 하지 않습니다.
		ia = bd;
		ia = (int)bd;
		
		
		// 주의 해야할점!!! 
		// 큰통에서 작은통에 담을때는 데이터의 손실이 발생할 수 있습니다.
		// 단순히 1L 텀블러에서 500ml 텀블러에 물을 옮길 때를 생각해보세요 
		// 1L 텀블러에 있는 물의 양에 따라 상황이 달라질 수 있겠죠.
		

		// 
		// 정수형 => 문자형
		// 정수형 작은것들을 문자형char[2B]에 집어넣으려고 하면 오류가 발생합니다.
		// Explicit Casting 해주도록 합시다.
		 
		
		char ca = 'a';
		byte be = 65;
		short sa = 374;
		int ib = 232321;
		ca = (char)be;
		System.out.println(ca);
		
		ca = (char)sa;
		System.out.println(ca);
		
		// 문자형 => 정수형
		// 바이트는 크기가 작아서 손실을 대비해 Explicit Casting 해주어야 하지만...
		be = (byte)ca;
		
		// 변수를 담는 통의 차이가 없기 떄문에 그냥 담깁니다.
		ib = ca;
		System.out.println("zz : " + ib);
		
		
		// 실수형
		// 정수형과 같습니다.
		char cb ='a';
		float fa = 65.77f;
		
		cb = (char)fa;
		System.out.println(cb);
		
		// 정수 => 실수
		// 자동 캐스팅 됩니다.
		
		byte byteA = 102; // 1B
		short shortA = 102; // 2B
		int intA = 102; // 3B
		long  longA = 102l; // 4B
		
		float floatA = 10.222f;
		double doubleA = 10.222;
		
		floatA = byteA;
		doubleA = byteA;
		System.out.println(floatA);
		System.out.println(doubleA);
		
		// 실수 => 정수
		float floatB = 102.222f;
		double doubleB = 102.222;
		
		byte byteB = 102;
		short shortB = 102;
		int intB = 102;
		long longB = 102l;
		
		// 오류발생 
		byteB = (byte)floatB;
		System.out.println("-------- 실수형에서 정수형으로 --------");
		System.out.println(byteB); // 소수부 부분 제거됨. 데이터 손실 발생
		
		
		
	}

}
