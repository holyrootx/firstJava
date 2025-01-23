package method;

public class method_4_Recursion {

	static void goToTen(int start) {
		System.out.println(start);
		if (start < 10) {
			goToTen(++start);
		} else {
			System.out.println("zz");
		}
	}
	static int doFactorial(int num) {
		return num = num <= 1 ? 1: num * doFactorial(--num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goToTen(4);
		
		int fact = doFactorial(5);
		System.out.println(fact);
	}

}
