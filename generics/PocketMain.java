package generics;

public class PocketMain {

	public static void main(String[] args) {
		
		// 제네릭으로 만들어진 클래스를 선언할 때는 클래스 명 뒤에 제네릭형식으로 들어갈 타입에 대한 명시를 해주어야합니다.
		// 또한 이 명시는 primitive Type은 불가하며 primitive Type을 사용해야 한다면 Wrapper 클래스로 적어주어야합니다.
		Pocket<Double,Double,Double> bodyInfo = new Pocket<Double,Double,Double>(
				Double.valueOf(171.12d),
				Double.valueOf(64.12d),
				Double.valueOf(99.3d));
		
		System.out.println(bodyInfo.getFieldA());;
//		Pocket<String,Integer,Boolean>[] people = new Pocket<>[]{
//			new Pocket<>("김뚝딱", 20, true),
//			new Pocket<>("김뚝딱", 54, true),
//			new Pocket<>("김뚝딱", 63, true),
//		};
		
//		Pocket<String, Integer, Boolean>[] people2 = new Pocket<>[] {
//                new Pocket<>("홍길동", 20, false),
//                new Pocket<>("전우치", 30, true),
//                new Pocket<>("임꺽정", 27, true),
//        };
    //  제네릭 클래스는 배열 생성시 new로 초기화 필수
//        Pocket<String, Integer, Boolean>[] people = new Pocket[] {
//                new Pocket<>("홍길동", 20, false),
//                new Pocket<>("전우치", 30, true),
//                new Pocket<>("임꺽정", 27, true),
//        };
	//  제네릭 클래스는 배열 생성시 new로 초기화 필수
        Pocket<String, Integer, Boolean>[] people = new Pocket[] {
                new Pocket<>("홍길동", 20, false),
                new Pocket<>("전우치", 30, true),
                new Pocket<>("임꺽정", 27, true),
        };
        // 아래는 타입체크 해서 오류 발생
//        Pocket<String, Integer, Boolean>[] people2 = new Pocket<>[] {
//                new Pocket<>("홍길동", 20, false),
//                new Pocket<>("전우치", 30, true),
//                new Pocket<>("임꺽정", 27, true),
//        };
        
       for(Pocket<String, Integer, Boolean> person : people) {
    	   System.out.printf("%s %d %b%n",
    			   person.getFieldA(),
    			   person.getFieldB(),
    			   person.getFieldC()
    			   );
    	   
       }
		
	}

}
