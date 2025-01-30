package objectMore.enumeration;

public enum CafeMenu {

	LATTE("라떼",2900),
	AMERICANO("아메리카노",1500),
	MOCHA("카페 모카",3500),
	ESPRESSO("에스프레소",1500);
	
	private String name;
	private int price;
	
	private CafeMenu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	private void displayMenu() {
		for(CafeMenu menu : CafeMenu.values()) {
			System.out.printf("메뉴 이름 : %s 가격 : %d원%n",menu.getName(),menu.getPrice());
		}
	}
	
}
