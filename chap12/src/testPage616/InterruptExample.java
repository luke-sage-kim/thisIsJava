package testPage616;

//1초후 출력 스레드를 중지시킴
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();			//스레드 객체 생성
		thread.start();								//스레드 실행
		try {Thread.sleep(1000);}					//메인 스레드 1초 일시정지
		catch(InterruptedException e) {}
		thread.interrupt();							//스레드 강제 예외 발생
	}}		