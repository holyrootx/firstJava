package useLambda;

public class LambdaPr1 {
	
	private interface SumAble{
		public abstract int sum(int x, int y);
	}
	private interface Upperable{
		public abstract String toUpper(String target);
	}
	public static void main(String[] args) {
		// �� ������ �Է¹޾� ���� ���� ��ȯ�ϴ� ���ٽ� �����
		SumAble s = (x,y) -> x + y;
		System.out.println(s.sum(10, 20));
		String aa="abc";
		
		
		Upperable toUp = String::toUpperCase;
		System.out.println(toUp.toUpper("zzzzzzzzzzzzzzzzzzzzzzzzz"));;
		//  ���ڿ��� �Է¹޾� �빮�ڷ� ��ȯ�ϴ� ���ٽ� �����
	}

}
