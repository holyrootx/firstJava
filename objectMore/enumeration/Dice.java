package objectMore.enumeration;

// enum 타입이 생기기전 상수들의 집합을 처리하는 방법 1
// Class 내부에 final static 으로 생성한다.
// 가독성 떨어짐
//public class Dice {
//	
//	
//	private static finalint ONE = 1;
//	private static final int TWO = 2;
//	private static final int THREE = 3;
//	private static final int FOUR = 4;
//	private static final int FIVE = 5;
//	private static final int SIX = 6;
//	    
//	public static void main(String[] args) {
//
//	    int num = Dice.ONE;
//
//	    switch (num) {
//	        case Dice.ONE:
//	            System.out.println("1 입니다.");
//	            break;
//	        case Dice.TWO:
//	        	System.out.println("2 입니다.");              
//	        	break;
//	        case Dice.THREE:
//	            System.out.println("3 입니다.");
//	            break;
//	        case Dice.FOUR:
//	            System.out.println("4 입니다.");
//	            break;
//	        case Dice.FIVE:
//	            System.out.println("5 입니다.");
//	            break;
//	        case Dice.SIX:
//	            System.out.println("6 입니다.");
//	            break;
//	    }
//	}
//}

//public interface Dice {
//	// 인터페이스 사용 
//	// 인터페이스는 인스턴스화는 하지못하지만 내부필드에 상수로 선언할 수있다.
//	// 가독성은 향상되었으나.. 상수는 다른 클래스 상수와도 비교할 때 제약이 없이 비교대상이 될 수 있다는 점 때문에 한계가 있다
//	// 예시 Month.JANUARY는 1이라는 값을 가지고 있으나 DICE의 1과 같다 라고하면 사람들은 어리둥절 할것이다.
//	// 내부적으로는 보이지않는 MONTH라는 가치가 숨어있기 때문이다.
//	// 실질적으로는 다르지만 자바는 그것을 구분할 방법이 없었다.
//	int ONE = 1;
//	int TWO = 2;
//	int THREE = 3;
//	int FOUR = 4;
//	int FIVE = 5;
//	int SIX = 6;
//	
//}

// 하.. 상수의 한계도 해결하고 여러모로 활용은 할 수 있지만..
// 생성하는 것이 너무 어렵고 불편하다.
//public class Dice{
//	
//	private int value;
//	
//	public Dice(int value) {
//		this.value = value;
//	}
//	
//	public static final Dice ONE = new Dice(1);
//	public static final Dice TWO = new Dice(2);
//	public static final Dice THREE = new Dice(3);
//	public static final Dice FOUR = new Dice(4);
//	public static final Dice FIVE = new Dice(5);
//	public static final Dice SIX = new Dice(6);
//	
//	public int getValue() {
//		return this.value;
//	}
//	
//}


// static block으로 값 한꺼번에 초기화
// 위와 방식은 같습니다.
public class Dice{
	
	private int value;
	
	public Dice(int value) {
		this.value = value;
	}
	
	public static final Dice ONE;
	public static final Dice TWO;
	public static final Dice THREE;
	public static final Dice FOUR;
	public static final Dice FIVE;
	public static final Dice SIX;
	
	public int getValue() {
		return this.value;
	}
	
	static {
		ONE = new Dice(1);
		TWO = new Dice(2);
		THREE = new Dice(3);
		FOUR = new Dice(4);
		FIVE = new Dice(5);
		SIX = new Dice(6);
	}		
	
}