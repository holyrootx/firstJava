package string;

public class String_6_Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "내이름 %s 키는 %f 몸무게는 %f 나이는 %d다..";
		
		String name = "김꿱꿱";
		double height = 160.1d;
		double weight = 121.1d;
		int age = 26;
	
		// String str2 = str1.formatted(name,height,weight,age);
		String str3 = String.format(str1,name,height,weight,age);
		
		// 문자열에 포맷팅 가능
		System.out.printf("내이름 %s 키는 %f 몸무게는 %f나이는 %d다..%n 퍼센트n은 줄바꿈이다.%n",name,height,weight,age);
		
		System.out.printf("%9d %09d %09d %09d%n",1,2,3,4);
		System.out.printf("%9d %9d %9d %9d%n",5,6,7,8);
		System.out.printf("%09d %09d %09d %09d%n",9,10,11,12);
		System.out.printf("%09d %09d %09d %09d%n",13,14,15,16);
		
		// %숫자1(자리수확보)
		// %0숫자 자리수 확보하고 0으로 채움
		// %+0;
		
		// %.2f // 소수점 n자리까지
		// %5.2f // 5자리 확보,소수점2자리까지
		// 506.3f // 전체 6자리확보하고 0으로 채움, 소수점 3자리까지
		System.out.printf("%07.3f %5.2f %3f %09f%n",13.23223,14.3244,15.1234,16.124);
		
	}

}
