package objectClass.makeImplement;

public class Button implements Cloneable{
    public enum Mode {
    	LIGHT("라이트"), DARK("다크");
    	
    	String indicator;
    	
        Mode(String indicator) { 
        	this.indicator = indicator; 
        }

		public String getIndicator() {
			return indicator;
		}

		public void setIndicator(String indicator) {
			this.indicator = indicator;
		}
        
    }

    private String name;
    private Mode mode;
    private int spaces;

    public Button(String name, Mode mode, int spaces) {
        this.name = name;
        this.mode = mode;
        this.spaces = spaces;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public int getSpaces() {
		return spaces;
	}

	public void setSpaces(int spaces) {
		this.spaces = spaces;
	}

	@Override
    public String toString() {
        return "[%s 테마] ['%s' 버튼] 크기 : [%d칸]%n"
                .formatted(mode.indicator, name, spaces);
    }

	@Override
	protected Button clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Button)super.clone();
	}
    
    
}
