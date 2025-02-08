package generics;

public class UseGenericMethod {

	public static void main(String[] args) {
		
		String a = "123";
		Integer b = Integer.valueOf(17);
		System.out.println(compare(a, b));
		
	}
	public static <K, V> boolean compare(K p1, V p2) {
        return p1.equals(p2);
    }

	public static <K extends Number, V extends Number> Number compare(K num1, V num2) {
		return (Number) Integer.valueOf(20);
	}
}
