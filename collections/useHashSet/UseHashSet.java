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
		
		// HashSet�� �ߺ��� ������� �ʴ´�.
		// ������ �������� �ʴ´�.
		// add�� ���߰�
		// remove�� �� ����
		// index�� �������� ���ϴϱ� ���� �ϳ��ϳ� �����Ϸ��� Iterator�� ����ؾ� �Ѵ�.
		// Iterator �ݺ��� ����
		Iterator setIt = set.iterator();
		
		while(setIt.hasNext()) {
			System.out.println(setIt.next());;
		}
		
		
		

	}

}
