package string;

public class String_5_Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 이어 붙이기
		// 1) 문자열 끼리의 더하기 연산 
		// 2) concat Method 사용 
		
		String str1 = "칙칙폭폭";
		String str2 = "개굴개굴";
		
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		String strV = "a" + "b" + "c" + "d" + "e";
		
		// 실제 더하기 연산 시 
		String strOperator = new StringBuilder("a")
				.append("b")
				.append("c")
				.append("d")
				.append("e").toString(); // 한꺼번에 변수 = "abcde" 생성됨
		
		String concatOperator = "a"
				.concat("b")  // "ab"
				.concat("c")  // "abc"
				.concat("d")  // "abcd"
				.concat("e"); // "abcde" 생성
		
		// 메모리 낭비될 여지가 있다.
		// 더하기 쓰자 별일 없으면 ㅇㅋ?
		
		// 반복하기
		//repeat(int 반복횟수);
		//System.out.println(str2.repeat());
		
		// 문자열 자르기
		String str3 = str1 + str2 + "띵띵땅땅"; 
		// 0 1 2 3
		// 칙칙폭폭 개굴개굴띵띵땅 0 ~ 11
		// String.substring(start,end) // start번째 부터 end-1까지
		System.out.println(str3.substring(0)); // 0부터 끝까
		System.out.println(str3.substring(3)); // 3부터 끝까
		System.out.println(str3.substring(3,11)); // 3부터 
		System.out.println(str3.substring(3,12)); // 3부터 12-1번째까지
		
		
		// 치환 하기
		// 
		String lunch ="점심에 중국집에가서 수육을 먹었다.";
		System.out.println(lunch.replace("중국집", "보쌈집"));
		System.out.println(lunch);
		
		String bark = "멍멍멍멍멍멍멍멍멍멍";
		System.out.println(bark.replaceAll("멍", "으르릉컹컹!!"));
		System.out.println(bark);

		// 문자열을 구분 기준을 가지고 쪼개어서 배열로 반환 
		// str1.split("구분할글자 공백도 가능 ");
		
		String str4 = "아-이-우-에-오";
		String str5 = "아이우에오";
		
		String[] str4_ = str4.split("-");
		String[] str5_ = str5.split("");
//		System.out.println(str4.split("-"));
//		System.out.println(str5.split(""));
		System.out.println();
		
		for(int i = 0 ;i < str4_.length;i++) {
			System.out.print(str4_[i]);
		}
		System.out.println();
		for(int i = 0 ;i < str5_.length;i++) {
			System.out.print(str5_[i]);
		}
		
		
	}

}
