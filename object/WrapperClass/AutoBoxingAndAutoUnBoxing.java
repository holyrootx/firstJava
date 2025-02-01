package object.WrapperClass;

public class AutoBoxingAndAutoUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Auto Boxing
		Integer myIntegerInst = 7;
		Double myDoubleInst = 23.43d;
		
		// Auto UnBoxing
		int myInt = Integer.valueOf(17);
		double myDouble = Double.valueOf(17.32d);
		
		// 원시값과 래퍼 클래스 객체간 혼용 연산 가능 
		int intPri = myIntegerInst + myInt;
		Integer myIntegerInst2 = myIntegerInst + myInt;
		System.out.println(intPri);
		System.out.println(myIntegerInst2);
		
	}

}
