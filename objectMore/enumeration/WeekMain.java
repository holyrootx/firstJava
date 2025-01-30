package objectMore.enumeration;

enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class WeekMain {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.FRIDAY;

		System.out.println(Week.FRIDAY);
		System.out.println(today);
		
		System.out.println("오늘은 " + today + "입니다.");

		switch (today) {
	    case MONDAY:
	    	System.out.println("월요일입니다. 한 주의 시작!");
	    	break;
	    case FRIDAY: 
	    	System.out.println("금요일입니다. 주말이 코앞!");
	    	break;
	    case SATURDAY: 
	    	System.out.println("주말입니다! 푹 쉬세요!");
	    	break;
	    case SUNDAY: 
	    	System.out.println("내일 월요일입니다 ㅋ 풉 쉬세요! 아 푹 쉬라구요 ㅋㅋ");
	    	break;	
	    default:
	    	System.out.println("평일입니다. 힘내세요!");
	    	break;
	}
		if (today == Week.MONDAY) {
		    System.out.println("월요일입니다. 힘내세요!");
		} else if (today == Week.FRIDAY) {
		    System.out.println("금요일입니다. 불금을 준비하세요!");
		} else if (today == Week.SATURDAY || today == Week.SUNDAY) {
		    System.out.println("주말입니다! 휴식을 즐기세요!");
		} else {
		    System.out.println("평일입니다. 열심히 일하세요!");
		}
		
		Week day = Week.valueOf("MONDAY");
		System.out.println(day); // MONDAY
		System.out.println(day.getClass());
		System.out.println(day.toString());
		System.out.println(day.TUESDAY);
		day = Week.TUESDAY;
		System.out.println(day.getDeclaringClass()); // class Week


		
	}

}
