package makeHierarchy;

public class Person implements Comparable<Person>{


	private static int lastNo = 0;
	
	private int num;
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		super();
		this.num = ++lastNo;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// 이름을 기준으로 비교한다.
	@Override
	public int compareTo(Person otherPerson) {
		return this.getName().compareTo(otherPerson.getName());
	}
	
	public static int getLastNo() {
		return lastNo;
	}

	@Override
	public String toString() {
		return "Person : {Num : %d}, {Name : %s}, {Age : %d}, {Height : %.2f}".formatted(num, name, age, height);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
}
