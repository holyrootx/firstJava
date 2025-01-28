package objectMore;

public class ButtonMain {

	public static void main(String[] args) {
		
		Button button1 = new Button("Enter");
        Button button2 = new Button("CapsLock");
        Button button3 = new Button("ShutDown");
        
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("줄바꿈");
                System.out.println("커서를 다음 줄에 위치");
            }
        });
        
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("CapsLock 눌러버리기.");
				
			}
		});
        

        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("닫아보리기");
				
			}
		});
        button1.func();
        button1.func();
        button2.func();
		button3.func();
		
		// 다형성 활용
		// 
		Button[] btns = {button1, button2, button3};
		
		for(Button btn :btns) {
			btn.func();
		}
		
		
		
	}

}
