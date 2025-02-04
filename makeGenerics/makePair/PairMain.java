package useGenerics;

public class PairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,String> name = new OrderedPair<String,String>("±è","¶Òµü");
		System.out.println(name.getKey());
		System.out.println(name.getValue());
	}

}
