package objectClassStudying.innerClass;

public class OutClass {
	private int num = 10; // 외부 클래스 멤버 필드 private 변수 
	private static int sNum = 20; // 외부 클래스 정적 변수
	
	private InClass inClass; // 멤버 클래스
	
	public OutClass() {
		inClass = new InClass(); // 외부 클래스 Default 생성자
		// 두개의 클래스 끼리 밀접한 관계가 있고
		// 하나의 클래스가 파생 되는 관계일 때 이런 식으로 하는 듯 ?
		
	}
	
	class InClass {
		int inNum = 100;
		// static은 컴파일 미리 해야 되기 때문에
		// 근데 객체 생성을 통제 당하는 중임
		// static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutClass num = " + sNum + "(외부 클래스의 Static 변수");
			
		}
//		static void sTest() {
//			
//		}
		public void usingClass() {
			inClass.inTest();
		}
		
		public class InnerTest {
			public static void main(String[] args) {
				OutClass outClass = new OutClass();
				
			}
		}
	}
}
