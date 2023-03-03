package testPage616;
//무한 반복해서 출력하는 스레드
public class PrintThread2 extends Thread{			//Thread 상속
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");		//문자열 출력 (0.1초 간격으로)
				Thread.sleep(900);	}				//0.9초 일시정지
		}catch(InterruptedException e) {}			//예외 발생시 while문 탈출
		System.out.println("자원 정리");			//문자열 출력
		System.out.println("실행 종료");
	}}

//0.9초 간격으로 "실행 중" 문자열이 계속 출력되다가, 1초 후에 메인 스레드가 thread.interrupt를 실행시키면
//
//PrintThread2에 예외가 발생하고, catch문에의해 while문을 벗어면서 "자원 정리" , "실행 종료"가 출력된다.
//
//여기서 특이점은 PrintThread2가 0.9초 간격으로 실행 중을 출력하기 때문에,
//
//1초 후에 thread.interrupt가 호출되어도 즉시 예외가 발생하지 않고, 
//"실행 중"이 두번째 출력되는 1.8초에 일시정지 상태가 되면
//
//InterruptedException 예외가 발생하고 스레드가 종료된다는 점이다.