package testPage580;

import java.awt.Toolkit;
//메인스레드만 이용한 경우

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();  // 툴킷 객체얻기
        //작업1
        for(int i=0; i<5; i++) {
            toolkit.beep();//비프음 발생
            System.out.println("왼발");
            try { Thread.sleep(500); } catch(Exception e) {}     //0.5초간 일시정지
        }    //end for
        
        //작업2
        for(int i=0; i<5; i++) {
            System.out.println("오른발");
            try {Thread.sleep(500); } catch(Exception e) {}  //0.5초간 일시정지
            }
        }
    
}
