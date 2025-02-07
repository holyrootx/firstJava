package collections.useHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UseHashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		// put���� ���� �ִ´�.
		// key value �����̴�
		// ���� �������� get
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
		
		// HashMap�� ��ü ���� ��ȸ�ϰ� ���� ���
		// Iterator �ݺ��� ������ ����Ѵ�.
		
		// 1. Key�� Iterator�� ��ü�� ����ϱ�
		// map.keySet();
		System.out.println("key�� Iterator�� ��ü�� ����ϱ�");
		Iterator mapKeyIter = map.keySet().iterator();
		
		while(mapKeyIter.hasNext()) {
			Integer key = (Integer)mapKeyIter.next();
			System.out.println(map.get(key)+"  " +map.get(key).getClass());
		}
		
		// 2. Value�� Iterator�� ��ü�� ����ϱ�
		System.out.println("Value�� Iterator�� ��ü�� ����ϱ�");
		Collection mapValueCol = map.values();
		Iterator mapValueIter = mapValueCol.iterator();
		
		while(mapValueIter.hasNext()) {
			String value = (String)mapValueIter.next();
			System.out.println(value);
		}
		
		// 3. Key,Value�� ���ÿ� Iterator�� ��ü�� ����ϱ�
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
