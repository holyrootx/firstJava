package method;

public class method_2_methodOverLoading {

	// 파라미터를 다르게 받아야하는 비슷한 동작을 하는 메서드들을 위해서 
	// Method OverLoading이 있다
	// 어떻게 사용하느냐
	// java Compiler는 Method Signature에 따라 Method를 구분하는데
	// Method Signature란 컴파일러가 메서드를 구분하는 기준이며
	// 1) 파라미터의 타입,개수,배치
	// 2) 함수의 이름
	// 함수의 이름은 같게, 파라미터의 타입,개수,배치는 다르게 하면
	// 같은 이름의 함수를 작성할 수 있다
	// 가독성을 위해서 진짜 그동작을 하는 것들만 OverLoading하여 
	// 우리같은 불쌍한 개발자를 구원할 수 있다.
	
	// Method OverLoading이 위대한 이유
	// System.out.println(); // 현재 우리는 불리안이든 소수든 정수든 char든 구분하지않는다.
	// 만약 OverLoading이 없다면 함수들이 이렇게 Naming 되었겠지
	// System.out.printlnBoolean();
	// System.out.printlnFloat();
	// System.out.printlnDouble();
	// System.out.printlnString();
	// System.out.printlnShort();
	// System.out.printlnInt();
	// System.out.printlnByte();
	// 그냥 찬양하자..
	
	public static int add(int x, int y) {
		return x + y;
	}
	public static double add(double x, double y) {
		return x + y;
	}
	public static float add(float x, float y) {
		return x + y;
	}
	public static byte add(byte x, byte y) {
		return (byte)(x + y);
	}
	public static short add(short x, short y) {
		return (short)(x + y);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = add(10, 30);
		double b = add(27, 54.2);
		System.out.printf("a = %d b = %f",a,b);
	}

}
