package testPage603;

public class ThreadA extends Thread {
 
    public boolean stop = false;  //정지
    public boolean work = true;  //진행
    
    @Override
    public void run() {
        while(!stop) {    // stop이 true가 되면 while문 종료
            if(work) {
                System.out.println("ThreadA 작업 내용");
            } else {
                Thread.yield();    // work가 false가 되면 다른 스레드에게 실행 양보
            }
        }
        System.out.println("ThreadA 종료");
    }
}
