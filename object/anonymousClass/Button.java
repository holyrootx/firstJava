package object.anonymousClass;

public class Button{

	String name;
	
	public Button(String name){
			this.name = name;
			}
	
	private OnClickListener onClickListener;
	public void setOnClickListener(OnClickListener onClickListener){
			this.onClickListener = onClickListener;
	}
	// 아래 처럼 쓸일은 없는데 그냥 다형성 강조하려고 아래처럼 작성해 보았음
	public void func(){
		onClickListener.onClick();
	}
}