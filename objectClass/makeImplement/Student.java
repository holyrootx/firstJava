package objectClass.makeImplement;

import java.util.Objects;

public class Student {

	int id;
	String name;
	boolean graduated;
	
	public Student(int id, String name, boolean graduated) {
		super();
		this.id = id;
		this.name = name;
		this.graduated = graduated;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		return id == other.id;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	
	
	
	
	
}
