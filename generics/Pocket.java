package generics;

public class Pocket<T1, T2, T3> {

	private T1 fieldA;
	
	private T2 fieldB;
	
	private T3 fieldC;
	
	// 제네릭으로 만든 경우 클래스 Declaration할 때 Class<> 안에 들어가는 제네릭 타입을 명시해주어야합니다.
	public Pocket(T1 fieldA, T2 fieldB, T3 fieldC){
		this.fieldA = fieldA;
		this.fieldB = fieldB;
		this.fieldC = fieldC;
		
	}

	public T1 getFieldA() {
		return fieldA;
	}

	public T2 getFieldB() {
		return fieldB;
	}

	public T3 getFieldC() {
		return fieldC;
	}
	
	
}
