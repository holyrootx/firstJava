package useLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UseFunctionalInter {

	public static void main(String[] args) {
		
		// 람다식으로 함수형 인터페이스를 간단하게 구현하는 것 까지는 편리해진거 ㅇㅋ
		// 근데 이러면 어짜피 계속 인터페이스를 만들어서 써야되는거 아닌가?
		// 여기에 이제 미리 함수형 인터페이스들을 여러개 제작해두었음
		// java.util.function. 여기 라이브러리들이 있음 
		// 외워서 써야되는건 어쩔 수 없음 ㅋㅋ ㅅㄱ
		
		// 영어 단어 외운다고 생각하면서 하자
		// Supplier - > 제공자 받는 것 없고 리턴값만 있다.
		
		Runnable dog = () -> System.out.println("멍멍ㅋㅋ");
		Runnable cat = () -> System.out.println("냥냥ㅋㅋ");
		Runnable cow = () -> System.out.println("음메ㅋㅋ");
		
		
		Button catButton1 = new Button("고양이");
		Button catButton2 = new Button("고양이");
		Button catButton3 = new Button("고양이");		
		catButton1.setOnClickListener(cat);
		catButton2.setOnClickListener(cat);
		catButton3.setOnClickListener(cat);
		
		for(Button catBtn : Arrays.asList(catButton1,catButton2,catButton3)) {
			System.out.print(catBtn.getText());
			catBtn.onClick();
		}
		
		// Consumer 
		Consumer<Button> clickBtn = b -> b.onClick(); 
		
		clickBtn.accept(catButton1);
		
		
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,5,4,53,53));
		number.forEach((a)-> System.out.println(a*a));
		
		HashMap<Integer,String> std = new HashMap();
		std.put(1,"가가");
		std.put(2,"가가가");
		std.put(3,"가가가가");
		std.put(4,"나");
		std.put(5,"나가");
		std.put(6,"나가가");
		std.put(7,"나가가가");
		std.put(8,"다");
		std.put(9,"다가");
		std.put(10,"다가가");
		
		std.forEach((key,value)->System.out.printf("%d번 이름 : %s%n",key,value));
		
		//
		
		Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
		Function<Integer, String> intToStrMR = String::valueOf;
		
		String intToStr = intToStrMR.apply(123);
		System.out.println(intToStr);
		
		// 인자로 받은 인스턴스의 메서드 실행
		UnaryOperator<String> toLCaseLD = (s) -> s.toLowerCase();
		UnaryOperator<String> toLCaseMR = String::toLowerCase;
		System.out.println(toLCaseLD.apply("AA"));
		
	}

}
