package testPage660;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// boxing()의 타입파라미터를 명시적으로Integer로 지정
		Box<Integer> box1 = Util.<Integer> boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		/* 타입파라미터 생략 가능 */
		// boxing()의 타입파라미터 String으로 추정 
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
