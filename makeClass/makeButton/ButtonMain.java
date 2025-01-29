package makeClass.makeButton;

public class ButtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToggleButton toggleButton = new ToggleButton("한영", 2);
		System.out.println(toggleButton.toString());
		toggleButton.clicked();
		System.out.println(toggleButton.toString());
		ToggleButton toggleButton2 = new ToggleButton(toggleButton);
		System.out.println(toggleButton2.toString());
		toggleButton2.setPrint("zzz");
		System.out.println(toggleButton.toString());
		System.out.println(toggleButton2.toString());
		
		
	}

}
