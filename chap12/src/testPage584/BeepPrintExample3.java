package testPage584;

import java.awt.Toolkit;
//메인 스레드와작업스레드가 동시에 실행
public class BeepPrintExample3 {
	public static void main(String[] args){
		Thread thread = new BeepThread();
		thread.start();

		
		for(int i=0; i<5; i++){
			System.out.println("띵");
			try{ Thread.sleep(1000);} //1000=1초
			catch(Exception e){}
		}
		
		// 익명 객체를 이용하는 방법
		Thread thread2 = new Thread(){
			@Override
			public void run(){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++){
					toolkit.beep();
					System.out.println("");

					try{ Thread.sleep(500);}catch(Exception e){} // 0.5초간 일시 정지
				}
			}
			
		};
	}
}
