package object;

public class Human extends Animal{

	String name;
	
	
	public Human(int age, String name) {
		super(age);
		this.name = name;
	}

	public void talk(String somthing) {
		System.out.println(somthing);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
}
