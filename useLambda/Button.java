package useLambda;

public class Button {
	
	private String text;
	public Button(String text) {
		this.text = text;
	}
	public String getText() {return text;}
	

	
	private Runnable onClickListener;
	
	// 보통 클래스의 내부의 객체로 두고 내부 객체의 메서드로 사용을 하는 듯 
	public void setOnClickListener(Runnable onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick()
	{
		onClickListener.run();
	}
}
