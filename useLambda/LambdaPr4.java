package useLambda;

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class LambdaPr4 {

	public static void main(String[] args) {
		System.out.println(calculate(10, 5, (a,b) -> a+b));
        System.out.println(calculate(10, 5, (a,b) -> a-b));
        System.out.println(calculate(10, 5, (a,b) -> a*b));
        System.out.println(calculate(10, 5, (a,b) -> a/b));
        
	}
	public static int calculate(int a, int b, Calculator c) {
        return c.operation(a, b);
    }

}
