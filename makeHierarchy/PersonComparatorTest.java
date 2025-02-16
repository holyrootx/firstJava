package makeHierarchy;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class PersonComparatorTest {

	public static void main(String[] args) {
		
		TreeSet[] treeSets = {
				new TreeSet(),
				new TreeSet(new PersonComparator(PersonComparator.SortBy.NO, PersonComparator.SortDir.ASC)),
				new TreeSet(new PersonComparator(PersonComparator.SortBy.AGE, PersonComparator.SortDir.ASC)),
				new TreeSet(new PersonComparator(PersonComparator.SortBy.HEIGHT, PersonComparator.SortDir.DESC))
				
		};
		
		for(Person p : new Person[] {
				new Person("가나", 32, 123.43),
				new Person("나나나", 22, 143.43),
				new Person("다가라", 12, 134.43),
				new Person("라가넝", 52, 173.43),
				new Person("훌라요", 42, 154.43),
				new Person("짱구요", 5, 114.43),
		}) for(TreeSet ts : treeSets) {
			ts.add(p);
		}

		for(TreeSet ts : treeSets) {
			for(Object p : ts) {
				if (p instanceof Person) {
					Person person = (Person)p;
					System.out.println(person);
				}
			}
			System.out.println("------------------------------------------------------------");
		}
	}

}
