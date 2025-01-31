package object.gptPr1;

public class Order {
	int orderId;
	String productName;
	OrderStatus status;
	
	
	void updateStatus(OrderStatus status) {
		 this.status = status;
	}
	void printOrderInfo() {
		System.out.printf("주문 번호 : %d 제품 명 :%s 주문 상태 : %s %n",orderId,productName,status);
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}