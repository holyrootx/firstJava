package useLambda;

@FunctionalInterface
public interface test1 extends testFath{
	void run(int a);
	
	@Override
	public default void carry(int a, int b) {
		System.out.println(a+b);
	}
}
