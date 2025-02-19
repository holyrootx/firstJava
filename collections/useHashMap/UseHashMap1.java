package collections.useHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class UseHashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		
		
		Iterator mapEntryIter = map.entrySet().iterator();
		while(mapEntryIter.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry)mapEntryIter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+value);
			
			
		}
		
	}

}
