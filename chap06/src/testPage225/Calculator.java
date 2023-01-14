package testPage225;
//클래스 내부에서 메소드 호출
public class Calculator {
	// 메소드
	int plus(int x, int y) {//.............(4)
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {//...............(3)
		double sum = plus(x, y); // plus() 메소드 호출
		double result = sum / 2;
		return result;

	}

	void execute() { //(1)
		double result = avg(7, 10); // avg메소드 호출    .....(2)
		println("실행결과: " + result); // println() 메소드 호출..........(5)
	}

	void println(String message) { // 메시지 띄우는 메소드........(6)
		System.out.println(message);
	}
}
