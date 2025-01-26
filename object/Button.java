package object;

public class Button {

    String print;
    int space;
    static String mode;

    // 생성자.
    Button (String print, int space) {
        this.print = print;
        this.space = space;
        mode = "LIGHT";
    }

    static void changeMode() {
    	mode = mode.equals("LIGHT") ? "DARK":"LIGHT"; 
    }
    void place () {
        System.out.printf(
                "표시: %s, 공간: %d, 모드: %s%n",
                print,space, mode
        );
    }
}