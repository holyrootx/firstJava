package objectClass.makeImplement;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1, "김똑똑", false);
		Student std2 = new Student(1, "김똑똑", false);
		Student std3 = new Student(3, "김똑똑", false);
		Student std4 = new Student(4, "김똑똑", false);
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		System.out.println(std1.equals(std4));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());
		System.out.println(std4.hashCode());
		
	}

}
