package makeComp;

import java.util.Arrays;

public class PersonMain {
	public static void main(String[] args) {
		
		String[] alphabets = new String[26];
		char a = 'a';
		
		for(int i = 0; i < alphabets.length ; i++) {
			alphabets[i] = Character.toString((char)(i + 'a')); 
		}
		System.out.println(Arrays.toString(alphabets));
		Person[] people = new Person[26];
		for(int i = 0 ; i < alphabets.length ; i ++ ) {
			people[i] = new Person(alphabets[i],(int)(Math.random()*100) +1);
		}
		
		Arrays.sort(people, (o1,o2) -> o1.getAge() - o2.getAge());
		System.out.println("-------------------------------------------------");
		for(Person person : people) {
			System.out.println(person);
		}
		
		Arrays.sort(people, (o1,o2) -> o1.getNum() - o2.getNum());
		System.out.println("-------------------------------------------------");
		for(Person person : people) {
			System.out.println(person);
		}
		
	}
}
