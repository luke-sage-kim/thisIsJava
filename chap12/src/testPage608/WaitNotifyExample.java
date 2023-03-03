package testPage608;


//두 스레드를 생성하고 실행하는 메인 스레드

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        
        threadA.start();
        threadB.start();
    }
}