package makeComp;

public class Person {

	private static int lastNo = 0;
	private String name;
	private int age;
	private int num;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		this.num = ++lastNo;
	}

	
	@Override
	public String toString() {
		return "학번 : %d, 이름 : %s, 나이 : %d".formatted(num,name,age);
	}


	public static int getLastNo() {
		return lastNo;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
