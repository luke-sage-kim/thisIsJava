package testPage580;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {// BeepTask 클래스와 짝임.

		// Runnable 인터페이스로 BeepTask(작업스레드 역할) 객체를 만들고
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // 그 객체를 담은 작업 스레드를 만들고
		thread.start();// thread 실행

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} // 0.5초간 일시정지
			catch (Exception e) {
			}
		}
	}
}

//Runnable 익명 객체 이용

// Thread thread = new Thread(new Runnable() {
//
//	@Override
//	public void run() {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i = 0;, i<5; i++){
//		toolkit.beep();
//		try{Thread.sleep(500);} catch(Exception e{}
//		}
//	}
//}

//람다식 이용
//Thread thread = new Thread(() ->{
//Toolkit toolkit = Toolkit.getDefaultToolkit();
//for(int i = 0;, i<5; i++){
//toolkit.beep();
//try{Thread.sleep(500);} catch(Exception e{}
//}

//});
