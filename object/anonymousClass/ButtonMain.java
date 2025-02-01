package object.anonymousClass;

public class ButtonMain {

	public static void main(String[] args) {
		Button button1 = new Button("Enter");
		Button button2 = new Button("CapsLock");
		Button button3 = new Button("ShutDown");

		button1.setOnClickListener(new OnClickListener(){
		
				@Override
				public void onClick(){
						System.out.println("Enter Button Clicked");
						System.out.println("커서를 다음 줄에 위치");
				}
		});
		button2.setOnClickListener(new OnClickListener(){
		
				@Override
				public void onClick(){
						System.out.println("CapsLock Button Clicked");
				}
		});
		button3.setOnClickListener(new OnClickListener(){
		
				@Override
				public void onClick(){
						System.out.println("ShutDown Button Clicked");
						System.out.println("작업 내용 저장");
						System.out.println("종료....");
				}
		});
		// 다형성 적용됨
		for( Button btn : new Button[] {button1,button2,button3}){
				btn.func();
		}

	}

}
