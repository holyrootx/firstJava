package makeClass.makeBook;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bookA = new Book("���Ƕ� �����ΰ�", "����Ŭ ����", 18000, "0A00000001");
		Book bookB = new Book("�����ϴٴ� ����", "����Ŭ ����", 20000, "0A00000001");
		Book bookC = new Book("������ �� �� ���� �͵�", "����Ŭ ����", 18000, "0A00000001");
		
		Book.getBookCount();
		System.out.println(bookA);
		System.out.println(bookB);
		System.out.println(bookC);
		System.out.println("================================================");
		
		System.out.println(bookA);
		bookA.applyDiscount(0.15);
		
		
	}

}
