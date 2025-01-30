package objectClass.makeImplement;

public class lookAroundObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button("zz", Button.Mode.DARK, 1);
		
		System.out.println(btn.toString());
		// System.out.println(btn.toString());
		// toString을 Overriding 하지않은 경우아래 처럼 클래스이름@Hascode to Hexa형태로 반환하는 것을 확인
		// objectClass.makeImplement.Button@7344699f
		
		// Tostring Overriding 후 내가 원하는 대로 출력되도록 작성
		// 다크 zz버튼 (1칸 차지)

		System.out.println(btn);
		Button copiedBtn = null;
		try {
		    copiedBtn = btn.clone();
		    System.out.println(copiedBtn);
		    
		} catch (CloneNotSupportedException e) {
		    e.printStackTrace(); // 예외 처리
		}
		copiedBtn.setName("zzzzzzz");
		System.out.println("복사 잘나 확인");
		System.out.println(copiedBtn);
		System.out.println(btn);
		Object object;
		
		
	}

}
