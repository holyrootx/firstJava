package string;

public class String_1_Basic {

	public static void main(String[] args) {
		
		// String 자료형 
		// Reference Type  immutable 변할 수 없는 값..
		// 선언 방식
		// 1. Literal 방식 
		// Type VariableName = "Value"
		// 쌍 따옴표로 감싸주어야 합니다.
		// 변수 생성 방식과 동일
		
		String literalStr1 = "Hello";
		String literalStr2 = "Hello";

		// Immutable이라 하였지만... 변경이 가능하네? 
		literalStr2 = "똥";
		literalStr2 = "Hello";
		 
		// Heap Memory의 String Constant pool 에 변수의 값을 생성
		// 메모리 절약을 위해서 같은 값은 모두 같은 곳을 가르킵니다.
		// 우리가 literalStr2의 값을 변경하면 string constant pool의 값이 바뀌는 것이아니고 
		// string constant pool에 새로운 값을 입력해주고 StackMemory가 그곳을가르키도록 변경해줍니다.
		// 그래서 String을 immutable하다 라고합니다. ==> 값을 변경하는 것이아니라 새로이 할당 하는 개념임.
		// 실제로 값을 변경하는 것이아니라 새로운 값을 String Constant pool에 저장하고 가르키는 주소를 변경해주기 때문입니다.
		
		// Stack 메모리에는 str이름 과 Heap Memory의 Constant String pool을 가르키는 주소를 Stack 메모리에
		// 저장하는 방식으로 생성합니다.
		// Heap Memory에 찾아가면 값을 가져올 수 있습니다.
		
		// 2. 인스턴스 생성방식
		// heap Memory에 인스턴스마다 메모리의 공간을 할당.
		// Garbage Collector가 객체의 사용이 끝나면 알아서 삭제 해주기 때문에 우리가 신경 쓸 건없고
		// 각각 메모리의 공간을 할당 한다고 생각하면 될 듯 합니다.
		String instanceStr1 = new String("Hello");
		String instanceStr2 = new String("Hello");
		
		
		// True로 출력 => Stack Memory에 같은 String Constant pool의주소를 가르키기 때문에  
		System.out.println(literalStr1 == literalStr2); // true
		
		// False로 출력 => Stack Memory에 1은 String Constant pool의 주소가 있고 
		// 2는 Heap의 전혀 다른 영역의 메모리 주소를 가르키고 있기떄문에 값이 같아도 False가 출력
		System.out.println(literalStr1 == instanceStr2); // 
		
		// False로 출력 => Stack Memory에 둘다 Heap Memory의 주소를 가르키고 있다는 것은 분명하나..
		// 각자 Heap Memory의 주소가 다르기 때문에... False를 반환
		System.out.println(instanceStr1 == instanceStr2);
		
		// 그럼 문자열의 순수한 값만을 비교하려면 어떻게 해야할까...
		// String.equals(비교할 스트링 변수 혹은 객체..);
		
		// 그래서 자바에서는 순수하게 값만으로 비교하는 메커니즘을 구현한 메서드를 만들어 놓았다..
		// 
		System.out.println(literalStr1.equals(instanceStr1));
		System.out.println(literalStr1.equals(instanceStr2));

		// 아니.. 진짜 메모리 다른 곳 가르키는 거 맞아요?
		// 니가 어떻게 증명할건데요?
		// 
		// 주소 식별자 확인하는 Method System.identityHashCode(Object);
		int hashCode = System.identityHashCode(literalStr1);
		
		System.out.println(System.identityHashCode(literalStr1));
		System.out.println(System.identityHashCode(literalStr2));
		
		System.out.println(System.identityHashCode(instanceStr1));
		System.out.println(System.identityHashCode(instanceStr2));
		
		
		

		
		
		
	}

}
