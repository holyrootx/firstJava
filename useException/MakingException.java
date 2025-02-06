package makeException;

public class MakingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			i = returnInt(new int[] {1,2,3,4,5});
			
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("せせせせせせせ");
			i = 0;
		}
		System.out.println(i);
		
	}
	
	public static int returnInt(int[] arr) throws ArrayIndexOutOfBoundsException {
		return arr[5];
	}
}
