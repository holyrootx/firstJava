package object.WrapperClass;

public class whatIsWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원시 자료형 primitive Type에 해당하는 모든 것 
		int myInt = 7;
		float myFloat = 7.9f;
		double myDouble = 7.43;
		char myChar = 'c';
		
		// Wrapper 클래스는 클래스와 사용법이 동일합니다.
		// 그냥 원시 타입을 객체로 만들기 위한 클래스입니다.
		// 기존의 생성 방식
		
		// deprecated 되었다고 이제 이딴식으로 생성하지 말라고하네요
		Integer myInteger2 = new Integer(7);
		Float myFloat2 = new Float(7.34f);
		Boolean myBoolean2 = new Boolean(false);
		Character myCharacter2 = new Character('a');

		Integer myInteger3 = Integer.valueOf(7);
		Float myFloat3 = Float.valueOf(7.34f);
		Boolean myBoolean3 = Boolean.valueOf(false);
		Character myCharacter3 = Character.valueOf('a');
		

		
	}

}
