package testPage614;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();	//스레드의 객체 생성
		printThread.start();							//스레드 실행
		try {Thread.sleep(1000);						//메인 스레드 1초 일시정지
		}catch(InterruptedException e) {}
		printThread.setStop(true);						//스레드의 필드값에 true 저장
	}
}
