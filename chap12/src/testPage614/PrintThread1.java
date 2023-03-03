package testPage614;

public class PrintThread1 extends Thread{				//스레드 상속
	private boolean stop;								//필드선언 기본값 false
	public void setStop(boolean stop) {					//호출시 매개값을 필드값에 저장
		this.stop = stop;
	}
	public void run() {
		while(!stop) {									//stop이 false일경우 반복
			System.out.println("실행 중");				//실행중 출력
		}
		System.out.println("자원 정리");				//while문이 종료되면 출력
		System.out.println("실행 종료");
	}}