package useLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person2 {
    String name;
    int age;
    double height;

    public Person2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
}


public class LambdaPr9 {

	public static void main(String[] args) {
		// TODO: ���̺� �׷�ȭ ��, �� ���� �׷쿡�� ���� Ű�� ū ����� �̸��� ã���ÿ�!!!!!!!!!!
		List<Person2> people = Arrays.asList(
	            new Person2("Alice", 25, 170.5),
	            new Person2("Bob", 30, 175.3),
	            new Person2("Charlie", 25, 180.2),
	            new Person2("David", 30, 169.7),
	            new Person2("Eve", 25, 165.0));
		// <R,A> R collect(Collector<? super T,A,R> collector)
		// 
		
		
		
    }
}


