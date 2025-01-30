package objectMore.enumeration;

public class CafeMenuMain {

	public static void main(String[] args) {
		
//		System.out.println(CafeMenu.LATTE);
//		System.out.println(CafeMenu.LATTE.getPrice());
		
		CafeMenu latte = CafeMenu.LATTE;
        System.out.printf("선택한 메뉴: %s, 가격: %d원%n", latte.getName(), latte.getPrice());
		
	}

}
