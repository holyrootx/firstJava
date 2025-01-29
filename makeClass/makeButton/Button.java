package makeClass.makeButton;

public abstract class Button{
	
	String print;
	int space;
	
	public Button(String print, int space) {
		this.print = print;
		this.space = space;
	}
	
	public abstract void clicked();

	public String getPrint() {
		return print;
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}
	
}
