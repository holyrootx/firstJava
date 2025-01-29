package makeClass.makeButton;

public class ToggleButton extends Button{

	private boolean isToggled;

	public ToggleButton(String print, int space, boolean isToggled) {
		super(print, space);
		this.isToggled = isToggled;
	}
	public ToggleButton(String print, int space) {
		super(print, space);
		this.isToggled = false;
	}
	public ToggleButton(ToggleButton toggleButton) {
		super(toggleButton.getPrint(), toggleButton.getSpace());
		this.isToggled = toggleButton.isToggled(); 
	}
	
	public void clicked() {
		setToggled(isToggled = isToggled()? false : true);
	}

	public boolean isToggled() {
		return isToggled;
	}

	public void setToggled(boolean isToggled) {
		this.isToggled = isToggled;
	}
	@Override
	public String toString() {
		return "ToggleButton Print is %s, Space is %d, isToggled is %b%n".formatted(print,space,isToggled);
	}
	
}
