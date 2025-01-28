package objectMore.enumeration;

public class ChickenMenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ChickenMenu.valueOf("FRIED"));
		System.out.println(ChickenMenu.valueOf("SEASONING"));
		System.out.println(ChickenMenu.valueOf("SOY"));
		
		// values => 객체 배열 반환 
		for(ChickenMenu menu :ChickenMenu.values()) {
			System.out.println(menu);
		}
		System.out.println();
		
		// 
		// String 객체로 이름 반환
		System.out.println(ChickenMenu.FRIED.name());
		// valueOf(EnumName) => 해당 EnumName을 가진 객체 반환
		// 그 객체가 가진 메서드 사용할 수 있음
		System.out.println(ChickenMenu.valueOf("FRIED").getName());
		// Enum객체.ordinal() 이 객체의 순서 반환 0부터 시작
		System.out.println(ChickenMenu.valueOf("FRIED").ordinal());
		
		
		
	}

}
