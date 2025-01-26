package object;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal person1 = new Human(10, "jake");
		Animal person2 = new Human(15, "jason");
		Animal person3 = new Human(25, "roy");
		Animal person4 = new Human(24, "tom");
		
		Animal[] animals = {
				person1,person2,person3,person4
		};
		
		for(Animal animal : animals) {
			animal.eat();
			// animal.talk();
			// 자식 요소의 메서드를 사용하고 싶다면 ?
			if( animal instanceof Human) {
				// Casting 처럼 변화 가능
				((Human)animal).talk("zzzzzz");;
			}
		}
		
	}

}
