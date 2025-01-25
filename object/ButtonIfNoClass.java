package object;

public class ButtonIfNoClass {
	static void placeButton (char print, int space, String mode) {
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print, space, mode
        );
    }
	public static void main(String[] args) {
		// 클래스가 없었다면...
		// 계산기를 살펴보세요
		// 계산기에는 여러버튼이 있습니다.
		// 더하기,숫자,빼기,등 여러가지가 있죠
		// 그러나 숫자는 숫자끼리 더하기는 빼기 등 연산과 관련된 연산자들끼리 분류하여 묶을 수 있는 특징이 있습니다.
		// 아래를 보시면 표시되는 문자, 공간크기,버튼의 색을 각각 지정해주고 
		// 자신들의 정보를 출력하는 메서드를 작성해주었습니다.
		// 그러나... 우리는 이러한 버튼을 최소 각 10개씩은 더만들어줘야 계산기 프로그램을 만들 수 있겠는데요..
		// 비슷한 속성을 가지는 객체들을 묶고 빠르게 작성할 수 있는 설계도가 있다면 정말 좋을 것 같지 않나요?
		
		// 클래스가 이러한 역할을 할 수 있습니다.
		// 내가 원하는 상태와 행동을 설계하고
		// 생성자를 만들어서 객체 생성시에 이러한 정보들을 한줄에 입력해서 객체를 생성하도록 도와주는 생성자도 있습니다.
		
		// 지금은 계산기일 뿐이지만
		// 
		
		// 몇백 몇천 몇만 수십만이 되는 고객 정보를 가지고 처리해야되는 프로그램은 어떨까요?
		// 고객의 정보를 하나하나 받아와서 변수를 생성해줘야할까요?
		// 그러면 개발자는 죽어날겁니다..
		// 이것이 바로 클래스가 필요한 이유가 됩니다.
		// 지금은 객체들이 넘쳐나는 세상이거든요
		// Button.java 파일에서 클래스를 설계하는 방법을 알아보도록 하겠습니다.
		
		// Button에서 클래스를 생성하고
		
		//  1 버튼
        char btn1Print = '1';
        int btn1Space = 1;
        String btn1Mode = "DARK";
        placeButton(btn1Print, btn1Space, btn1Mode);

        //  더하기 버튼
        char btnPlusPrint = '+';
        int btnPlusSpace = 3;
        String btnPlusMode = "DARK";
        placeButton(btnPlusPrint, btnPlusSpace, btnPlusMode);

        //  클리어 버튼
        char btnClearPrint = 'C';
        int btnClearSpace = 2;
        String btnClearMode = "DARK";
        placeButton(btnClearPrint, btnClearSpace, btnClearMode);
		
	}

}
