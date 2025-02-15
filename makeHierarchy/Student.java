package makeHierarchy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.score, other.score); // 오름 차순
        //return Integer.compare(other.score, this.score); // 내림 차순
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }



    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 90),
            new Student("Bob", 85),
            new Student("Charlie", 95)
        );

        Collections.sort(students); // Sort automatically using compareTo
        System.out.println(students);
        
        // 클래스가 Comparable<T> 인터페이스를 구현하면, 그 객체들은 자동으로 정렬될 수 있습니다.
        // 
        // Collections.sort() (리스트용) 또는 Arrays.sort() (배열용)를 사용하면, 별도의 정렬 로직을 작성할 필요 없이 compareTo 메서드를 기준으로 정렬됩니다.
    }
    
  }

