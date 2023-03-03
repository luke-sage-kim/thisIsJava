package testPage603;
//스레드 실행 양보예제
public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA(); // 객체를 만들자
		ThreadB threadB = new ThreadB();
		// ThreadA, ThreadB 모두 실행
		threadA.start();// 
		threadB.start();//

		try {  //7번줄 하는동안 실행해야한다
			Thread.sleep(3000);  //메인을 잠시 멈춘다  멈추는 동안 틈이 생겨 끼어들틈에 다른거실행한다
			//3초동안 멈춘다
		} catch (InterruptedException e) {
			
		}
		threadA.work = false; // ThreadB만 실행    //3초뒤에 A를 멈춰줘야한다

		try { //7번줄 하는동안 실행해야한다
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true; // ThreadA, ThreadB 모두 실행

		try { //7번줄 하는동안 실행해야한다
			Thread.sleep(3000); //3초뒤에 다시 stop을 트루로
		} catch (InterruptedException e) {
		}
		// ThreadA, ThreadB 모두 종료
		threadA.stop = true;
		threadB.stop = true;
	}
}
