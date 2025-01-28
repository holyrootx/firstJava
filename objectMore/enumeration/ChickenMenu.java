package objectMore.enumeration;

public enum ChickenMenu {

	FRIED("후라이드치킨",9900,"말그대로 후라이드 치킨"),
	SEASONING("양념치킨",10900,"고추장 양념에 절인 치킨"),
	SOY("간장치킨",10900,"간장에 절인 치킨");
	
	
	
	private String name;
	private int price;
	private String description;
	
	private ChickenMenu(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
