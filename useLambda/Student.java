package useLambda;

public class Student{

	static int scNum = 0;
	int num;
	String name;
	
	public Student(String name) {
		this.num = ++scNum;
		this.name = name;
	}
	
	public static int getScNum() {
		return scNum;
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

	@Override
	public String toString() {
		return "{이름 : %s }, {학번 : %d}".formatted(name,num);
	}
	
	
	public void printStudentInfo(Printable printable) {
		printable.print();		
	}
	
	
	
	
}
