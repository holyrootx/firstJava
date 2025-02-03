package makeClass.makeBook;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bookA = new Book("정의란 무엇인가", "마이클 샌델", 18000, "0A00000001");
		Book bookB = new Book("공정하다는 착각", "마이클 샌델", 20000, "0A00000001");
		Book bookC = new Book("돈으로 살 수 없는 것들", "마이클 샌델", 18000, "0A00000001");
		
		Book.getBookCount();
		System.out.println(bookA);
		System.out.println(bookB);
		System.out.println(bookC);
		System.out.println("================================================");
		
		System.out.println(bookA);
		bookA.applyDiscount(0.15);
		
		
	}

}
