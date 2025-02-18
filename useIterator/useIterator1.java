package useIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class useIterator1 {

	public static void main(String[] args) {
		// 이터레이터
		// java.lang.Iterable 인터페이스를 구현한 클래스에서 사용
		// 컬렉션을 순회 하는 용도로 사용한다.
		
		HashSet<Integer> intSet = new HashSet<>(
				Arrays.asList(1,2,3,4,5,6,7)
				);
		Iterator setIter = intSet.iterator();
		
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
		
		ArrayList<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> odds = new ArrayList();
		ArrayList<Integer> evens = new ArrayList();
		
		Iterator arrIter = numbers.iterator();
		while(arrIter.hasNext()) {
			int num = (Integer)arrIter.next();
			if(num % 2 != 0) {
				odds.add(num);
			} else {
				evens.add(num);
			}
		}
		System.out.println(odds);
		System.out.println(evens);
		
		
		
		
	}

}
