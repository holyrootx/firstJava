package collections.useHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UseHashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		// put으로 값을 넣는다.
		// key value 형태이다
		// 값을 꺼낼때는 get
		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		
		System.out.println(map);
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
		// HashMap도 전체 값을 순회하고 싶은 경우
		// Iterator 반복자 패턴을 사용한다.
		
		// 1. Key를 Iterator의 객체로 사용하기
		// map.keySet();
		System.out.println("key를 Iterator의 객체로 사용하기");
		Iterator mapKeyIter = map.keySet().iterator();
		
		while(mapKeyIter.hasNext()) {
			Integer key = (Integer)mapKeyIter.next();
			System.out.println(map.get(key)+"  " +map.get(key).getClass());
		}
		
		// 2. Value를 Iterator의 객체로 사용하기
		System.out.println("Value를 Iterator의 객체로 사용하기");
		Collection mapValueCol = map.values();
		Iterator mapValueIter = mapValueCol.iterator();
		
		while(mapValueIter.hasNext()) {
			String value = (String)mapValueIter.next();
			System.out.println(value);
		}
		
		// 3. Key,Value를 동시에 Iterator의 객체로 사용하기
		// Map.Entry
		Iterator mapEntryIter = map.entrySet().iterator();
		
		while(mapEntryIter.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)mapEntryIter.next();
			Integer key = (Integer)mapEntry.getKey();
			String value = (String)mapEntry.getValue();
			System.out.printf("Key => %d Value => %s%n",key.intValue(),value);
		}
		
		
	}

}
