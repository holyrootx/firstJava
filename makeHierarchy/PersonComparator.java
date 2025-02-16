package makeHierarchy;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	
	public enum SortBy {NO,NAME,AGE,HEIGHT};
	
	public enum SortDir {ASC,DESC};
	
	private SortBy sortBy;
	private SortDir sortDir;
	
	public PersonComparator(SortBy sortBy,SortDir sortDir) {
		this.sortBy = sortBy;
		this.sortDir = sortDir;
	}

	@Override
	public int compare(Person o1, Person o2) {
		int result  = 0;
		
		switch (sortBy) {
			case NO: result =  (o1.getNum() > o2.getNum()) ? 1 : -1; 
			case NAME: result =  o1.getName().compareTo(o2.getName()); 
			case AGE: result =  (o1.getAge() > o2.getAge()) ? 1 : -1;
			case HEIGHT: result =  (o1.getHeight() > o2.getHeight()) ? 1 : -1; 
		}
		return result * (sortDir ==sortDir.ASC ? 1 : -1);
	}
	
	
	
}
