package objectMore.enumeration;

public class Button {

	private ButtonMode buttonMode = ButtonMode.DARK;
	private ButtonSpace buttonspace = ButtonSpace.SINGLE;
	
	
	public ButtonMode getButtonMode() {
		return buttonMode;
	}
	public void setButtonMode(ButtonMode buttonMode) {
		this.buttonMode = buttonMode;
	}
	public ButtonSpace getButtonspace() {
		return buttonspace;
	}
	public void setButtonspace(ButtonSpace buttonspace) {
		this.buttonspace = buttonspace;
	}
	
	
}
