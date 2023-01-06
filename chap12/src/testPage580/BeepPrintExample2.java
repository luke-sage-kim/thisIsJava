package testPage580;

public class BeepPrintExample2 {
public static void main(String[] args) {//BeepTask 클래스와 짝임.
        
        //Runnable 인터페이스로 BeepTask(작업스레드 역할) 객체를 만들고
        Runnable beepTask = new BeepTask();              
        Thread thread = new Thread(beepTask);  //그 객체를 담은 작업 스레드를 만들고           
       
        thread.start();//thread 실행
        
     
        //---------------------------
        
        for (int i = 0; i < 5; i++) {
            System.out.println("원");
            try { Thread.sleep(50); } //0.5초간 일시정지
            catch (Exception e) {}
        }
    }
}
