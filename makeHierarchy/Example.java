package makeHierarchy;

import java.util.TreeSet;


public class Example {
	
    public static void main(String[] args) {
        TreeSet<Student> studentSet = new TreeSet<>();

        studentSet.add(new Student("Alice", 90));
        studentSet.add(new Student("Bob", 85));
        studentSet.add(new Student("Charlie", 95));

        System.out.println(studentSet);
    }
}

