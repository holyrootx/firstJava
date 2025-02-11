package useLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class LambdaPr8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
	            new Person("John", 25),
	            new Person("Jane", 19),
	            new Person("Jake", 30),
	            new Person("Alice", 18),
	            new Person("Bob", 22));
	
		// 여기에 람다식 + Stream API 활용
		//    void accept(T t);
        people.stream().filter(person-> person.getAge() >= 20)
              .forEach(person -> {
            	  System.out.printf("이름 : %s 나이 : %d %n",person.name,person.age);
              });
		
	}

}
