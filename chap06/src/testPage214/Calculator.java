package testPage214;

public class Calculator {
	// 메소드
	void powerOn() { // void:함수가 끝날 때 리턴값이 없다
		System.out.println("전원을 켭니다");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result; // 테스트에있는 리저트로 돌아갓!
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	int multiple(int x, int y) {
		int result = x * y;
		return result;
	} //

	int arrayMethod(int... values) {

		for (int i = 0; i < values.length; i++) {
			System.out.println(i);
		}
		return 0;
	}

	int sum(int... values) {   //매개 변수의 수를 모를경우  ...사용해서 선언시 넘겨준값 수 에 따라 자동으로 배열이 생성
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			
			sum += values[i];
			System.out.println(i);
		
		}
		return sum;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
