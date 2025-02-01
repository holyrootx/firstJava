package object.WrapperClass;

public class WrapperClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  💡 숫자 클래스 메소드들

        //  CharSequence로부터 인스턴스 반환
        //  ⭐ CharSequence : String 등이 구현하는 인터페이스
        Integer int1 = Integer.valueOf("123"); // 문자열로부터 인스턴스 반환

        //  CharSequence로부터 원시값 반환
        //  💡 다른 숫자, 불리언 래퍼 자료형들에도 존재 (parseDouble, parseBoolean...)
        int int2 = Integer.parseInt("123"); // 원시값 반환

        //  parseInt(CharSequence, 진수)
        //  정수 자료형들에만 존재
        //  ⭐ CharSequence : String 등이 구현하는 인터페이스
        int int_123_oct = Integer.parseInt("123", 8);
        int int_123_dec = Integer.parseInt("123", 10);
        int int_123_hex = Integer.parseInt("123", 16);

        //  parseInt(CharSequence, 시작위치, 끝위치, 진수)
        int int3 = Integer.parseInt("1234567", 3, 5, 10);
        
        System.out.println(int1.SIZE);
        System.out.println(int1.BYTES);
        System.out.println(int1.MAX_VALUE);
        System.out.println(int1.MIN_VALUE);
        float ff = int1.floatValue();
        System.out.println(ff);
        System.out.println("========================================================");
        System.out.println(Integer.parseInt("123"));
        //System.out.println(Integer.parseInt("123A"));
        System.out.println(Double.parseDouble("123.47d"));
        
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Integer.parseInt("1234567", 3, 5, 10));
        System.out.println(Integer.parseInt("1234567", 0, 5, 10));
        System.out.println(Double.valueOf("123.47d"));
        
        Character ch = Character.valueOf('a');
        Double db = Double.valueOf("27.48d");
        
		//  💡 문자 클래스 메소드들
        System.out.println("========================================================");
        String strSample = "Ab가1 .";
        for (int i = 0; i < strSample.length(); i++) {
            Character c = strSample.charAt(i);
            System.out.printf(
                    "[%c] : 문자인지?: %b, 대문자인지?: %b, 소문자인지?: %b, 숫자인지? : %b, 공백인지? : %b%n",
                    c,
                    Character.isLetter(c),
                    Character.isUpperCase(c),
                    Character.isLowerCase(c),
                    Character.isDigit(c),
                    Character.isSpaceChar(c)
            );
        }
        System.out.println("========================================================");
        Character charInst = "abcdefg".charAt(0);
        System.out.println(charInst);
        // java.lang.StringIndexOutOfBoundsException
        charInst = "abcdefg".charAt(1);
        System.out.println(charInst);
		//  💡 인스턴스 메소드들

        //  문자열 반환 (Object에서 오버라이드)
        // int1에는 123 들어있음
        String intStr = int1.toString();
        String dblStr = Double.valueOf(3.14d).toString();
        String blnStr = ((Boolean) false).toString();
        String chrStr = Character.valueOf('a').toString();
       
        System.out.println(intStr);
        System.out.println(dblStr);
        System.out.println(blnStr);
        System.out.println(chrStr);
        
        System.out.println("========================================================");
		//  인스턴스끼리의 value 비교
        Integer intA = 12345;
        Integer intB = 12345;
        boolean compByOp1 = intA == intB; // ⚠️ 값은 같으나 다른 참조
        boolean compByEq1 = intA.equals(intB);
        
        System.out.println(intA == intB); 
        System.out.println(intA.equals(intB)); 
        
        Short srtA = 12345;

        //  ⚠️ 자료형이 다르면 false 반환 (메소드 코드 확인)
        boolean compByOp2 = intA.equals(srtA);
        System.out.println(intA.equals(srtA));
        
        Integer iIII = Integer.valueOf(17);
        int iiii = iIII.intValue();
        System.out.println();
        Character characterInst = Character.valueOf('a');
        System.out.println(characterInst.charValue()); // a
        
        Boolean booleanInst =Boolean.valueOf(true);
        System.out.println(booleanInst.booleanValue()); // true
        
        Integer integerInst = Integer.valueOf(28343);
        System.out.println(integerInst.doubleValue()); // 28343.0
        
        Double doubleInst = Double.valueOf(198797.34d);
        System.out.println(doubleInst.doubleValue());
        System.out.println(doubleInst.floatValue());
        System.out.println(doubleInst.intValue());
        System.out.println(doubleInst.shortValue());
        System.out.println(doubleInst.byteValue());
        
	}	
	

}
