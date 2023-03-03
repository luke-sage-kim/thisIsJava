package testPage600;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			System.out.println("띵");
			try {
				Thread.sleep(3000); //메인 스레드를 2초동안 일시 정지 상태로 만듭니다.
			}catch (InterruptedException e) {
			}
		}
	}


}
