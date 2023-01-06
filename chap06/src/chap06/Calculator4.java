package chap06;

public class Calculator4 {
	// 정적 멤버 사용

		static double pi = 3.141592; //정적 필드클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드

		//정적 메소드  클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드
		static int plus(int x, int y) {
			return x + y;
		}

		static int minus(int x, int y) {
			return x - y;
		}
}
