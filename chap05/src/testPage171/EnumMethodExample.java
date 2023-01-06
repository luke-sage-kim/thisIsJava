package testPage171;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() 메소드
		Week today = Week.SUNDAY;   //Week열거타입을 가져온다
		String name = today.name(); 
		System.out.println(name);//요일소환
		System.out.println();
	

		// ordianl() 메소드
		int ordinal = today.ordinal();// 열거 객체중 몇 번쨰 열거 객체인지 알려줌
		System.out.println(ordinal);
		System.out.println();

		// compareTo() 메소드  주어진 열거 객체를 기준으로 전후로 몇 번쨰 위치하는지 비교
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		// valueOf  매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 리턴  컨피규레이션 해야됨
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			}  else {
				System.out.println("평일 이군요");
			}
			
	
			}else {
				System.out.println("null");
			
		}
		
		System.out.println();

		// values() 메소드
		Week[] days = Week.values();//모든 열거 객체들을 배열로 리턴
		for(Week day : days) {
			System.out.println(day);
		}
		
	}
}
