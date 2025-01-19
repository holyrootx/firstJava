package string;

public class String_4_Escape {

	public static void main(String[] args) {
		
		
		String str1 = "스트링을 우리는 큰따옴표로 인지할 수 있습니다... 그러나.. 몇가지 특이 사항이 존재합니다";
		// String str2 = "큰 따옴표를 넣으면 오류가 "발생" 하죠 "; // 주석 해제해 보세요
		
		String str3 = "큰 따옴표를 쓰려면 앞에 역슬래쉬를 붙여주세요 \"\"\"\"\" ";
		String str4 = "줄바꿈을 하려면 \n";
		String str5 = "탭을 넣고 싶으면 \t";
		String str6 = "역슬래쉬를 넣고 싶으면 \\ 두번 써주세요 \\ \\ \\ ";
		
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}