package useLambda;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInter si = (a) -> a  * a;
		System.out.println(si.run(10));
		DoubleInter di = (a,b) -> a * b;
		System.out.println(di.run(19, 20));
	}

}
