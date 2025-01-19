package operator;

public class Operator {

	public static void main(String[] args) {
		
		// 1. Arithmetic Operators
		// + - * / % 굳이 정리 안함
		
		// 2. Assignment Operators
		// Assign =은 등호가 아니다.
		// Assignment 는 대입이다.
		// a = b b의 Stack Memory주소를 a에 담는 다는 뜻이다.
		// Arithmetic Operator와 결합하여 += -= 사용 가능하다.
		
		// 3. Comparison Operators
		// Return Value는 Boolean 이다.
		
		// == 같냐고 물어보는 연산자 a == b a와 b가 같으면 참이고 아니면 거짓이다.
		// != 다르냐고 물어보는 연산자 a != b는 a와 b가 다르면 참이고 아니면 거짓이다.
		// 둘의 Stack Memory 값을 비교한다.
		
		// 4. Logical Operators
		// 여러가지의 Condition을 섞어 활용한다.
		// && || !
		// Condition A && Condition B && Condition C ; ==> ABC가 전부 True여야 True를 반환한다.
		// Condition A || Condition B || Condition C ; ==> ABC가 중 하나라도 True면 True를 반환한다.
		
		// 최단 연산
		// 윗줄에 전부터  A => B => C 이순서대로 연산을 진행한다.
		// 그렇지만 &&는 A가 False면 그 뒤로는 연산 하지않는다.
		// ||는 A가 True면 뒤의 B,C는 연산 하지 않는다.
		
		// 5. Increment and Decrement Operators
		// ++ -- 앞에 쓰냐 뒤에 쓰냐에 따라 결과가 달라질 수 있다.
		// 유의 하면서 쓰도록 하자 
		
		// 6. BitWise Operators
		// 안쓴대 
		
		// 7. Ternary Operator
		// A shorthand for if-else.
		// 
		// condition ? value_if_true : value_if_false
		
		// 8. instanceof Operator
		// Checks if an object is an instance of a specific class or subclass.
		// 특정 오브젝트가 특정 오브젝트의 객체인지 검사함..
		// Return Value == Boolean;
		String str = "Hello";
		System.out.println(str instanceof String); // Output: true




	}

}
