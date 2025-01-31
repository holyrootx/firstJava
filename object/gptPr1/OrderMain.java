package object.gptPr1;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 =  new Order();
		order1.orderId = 1;
		order1.productName = "폰케이스";
		order1.status = OrderStatus.ORDERED;
		order1.printOrderInfo();
		order1.updateStatus(OrderStatus.SHIPPED);
		order1.printOrderInfo();
		
	}

}
