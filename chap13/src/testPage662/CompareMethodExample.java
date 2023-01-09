package testPage662;

public class CompareMethodExample {
	public static void main(String[] args) {
		// 객체 호출
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
		// Util의 compare 메소드 호출
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		// 객체 호출
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");// 스트링이랑 인티저가 다르듯이
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");//유저2로 저장해서 논리적으로 동등하지 아니하다
		
		// Util의 compare 메소드 호출
		boolean result2 = Util.compare(p3, p4);
		
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}



}
