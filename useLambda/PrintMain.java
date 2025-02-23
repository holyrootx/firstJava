package useLambda;

public class PrintMain {

	public static void main(String[] args) {
		
		String[] strs = new String[26]; 
		char a = 'a';
		for(int i = 0 ;i < 26; i++) {
			strs[i] = String.valueOf(((char)(i + a)));
		}
		
		Student[] students = new Student[26];
		
		for(int i = 0; i < students.length ; i++) {
			students[i] = new Student(strs[i]);
		}
		
		for(Student std : students) {
			if (std instanceof Student) {
				std.printStudentInfo(()-> System.out.println(std));
				
			}
			
		}
		
	}

}
