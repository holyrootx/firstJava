package useLambda;

public class LambdaPr1 {
	
	private interface SumAble{
		public abstract int sum(int x, int y);
	}
	private interface Upperable{
		public abstract String toUpper(String target);
	}
	public static void main(String[] args) {
		// 두 정수를 입력받아 더한 값을 반환하는 람다식 만들기
		SumAble s = (x,y) -> x + y;
		System.out.println(s.sum(10, 20));
		String aa="abc";
		
		
		Upperable toUp = String::toUpperCase;
		System.out.println(toUp.toUpper("zzzzzzzzzzzzzzzzzzzzzzzzz"));;
		//  문자열을 입력받아 대문자로 변환하는 람다식 만들기
	}

}
