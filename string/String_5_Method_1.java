package string;

public class String_5_Method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 크기 확인
		// 문자열의 길이가 0인지 확인
		// 앞뒤 공백 제거
		// n번째 문자 char 반환
		// 찾는 문자열이 몇번째 부터 시작하는지 찾기
		// 문자 포함 여부 검사
		// 특정 문자로 시작하는지 특정 문자로 끝나는지 검사
		// 대소문자로 변환
		
		// 문자열 뒤에 . 붙이고 length(); 문자열의 크기 반환
		// return Value = int ;
		
		int intValue1 = " ".length(); // 0
		int intValue2 = "2개".length(); // 2
		int intValue3 = "3개임 ".length(); // 4
		int intValue4 = "4개정도".length(); // 4
		int intValue5 = "\n\t".length(); // 2 공백 관련된 문자를 White Space라고 부르는데 1글자로 취급함.

		System.out.println(intValue1);
		System.out.println(intValue2);
		System.out.println(intValue3);
		System.out.println(intValue4);
		System.out.println(intValue5); 
		
		String emptyValue = "";
		String whiteSpace1 =" \n\t";
		
		
		// IsEmpty(); 문자열의 길이가 0인지 여부
		boolean bool1 = emptyValue.isEmpty(); // true
		boolean bool2 = whiteSpace1.isEmpty(); // false
		System.out.println(bool1);
		System.out.println(bool2);
		

		// 앞뒤 White Space 제거 
		// trim();
		// return Value String 
		// 없앤 문자열 반환
		
		String str1 = "  \n\t 컴포즈커피 먹을까!!!!! \n\t  ";
		String trimedStr = str1.trim();
		
		System.out.println(trimedStr);
		
		// String.charAt(n)
		// n번째 문자열을 char형으로 반환 
		// Return value char
		
		char chFromStr=str1.charAt(7);
		
		System.out.println(chFromStr);
		
		// 이런식 으로 활용
		char lastStr = str1.charAt(str1.trim().length()-1);
		System.out.println(lastStr);
		
		// 문자열이 몇번째에 있는 지 찾기 
		// String.indexOf("찾을 문자열")
		
		String str2 = "충전기 아이폰 맥북 에어팟 충전기 아이폰 텀블러 볼펜";
		System.out.println(str2.indexOf("아이폰"));
		System.out.println(str2.indexOf("충전기"));
		System.out.println(str2.indexOf("아이폰",4)); // n을 파라미터로 전달하면 n 번째부터 조사함
		System.out.println(str2.indexOf("아이폰",5)); // n을 파라미터로 전달하면 n 번째부터 조사함
		
		
		// 포함 여부 확인 
		// Return Value true or false
		System.out.println(str2.contains("아이폰"));
		System.out.println(str2.contains("갤럭시"));
		
		// 문자열이 "str"로 시작하는지 확인 
		System.out.println(str2.startsWith("충전기"));;
		System.out.println(str2.startsWith("아이폰"));;
		
		// 문자열이 "str"로 끝나는지 확인
		System.out.println(str2.endsWith("볼펜"));
		System.out.println(str2.endsWith("충전기"));
		
		// 정규표현식과 일치 하는지 확인
		// str.matches(정규표현식형태의문자열);
		// Return Value true or False Return
		
		// 대소문자로 변환
		// 
		String lowerStr = "abcdef";
		String upperStr = "ABCDEF";
		
		System.out.println(lowerStr.toUpperCase());
		System.out.println(upperStr.toLowerCase());
		
		
		
		
	}

}
