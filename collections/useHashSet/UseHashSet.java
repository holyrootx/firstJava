package collections.useHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class UseHashSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(Integer.valueOf(10));
		set.add(Integer.valueOf(11));
		set.add(Integer.valueOf(12));
		set.add(Integer.valueOf(13));
		set.add(Integer.valueOf(13));
		set.add(Integer.valueOf(13));
		
		// HashSet은 중복을 허용하지 않는다.
		// 순서도 보장하지 않는다.
		// add로 값추가
		// remove로 값 삭제
		// index로 접근하지 못하니까 값을 하나하나 접근하려면 Iterator를 사용해야 한다.
		// Iterator 반복자 패턴
		Iterator setIt = set.iterator();
		
		while(setIt.hasNext()) {
			System.out.println(setIt.next());;
		}
		
		
		

	}

}
