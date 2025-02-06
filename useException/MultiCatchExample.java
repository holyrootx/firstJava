package makeException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException 발생!!!!!!!!!!
            
            String text = null;
            System.out.println(text.length()); // NullPointerException 발생!!!!!!!!!!
            
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			//e = new ArithmeticException("새로운 예외 객체"); // ❌ 컴파일 오류!!!!!!!!!!
            e.printStackTrace();
        	System.out.println("예외 발생: " + e.getMessage());
        } finally {
        	System.out.println("으악!!! 사건발생 사건발생");
        }
        
    }
    
}

