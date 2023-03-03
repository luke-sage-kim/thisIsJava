package testPage608;

//두 스레드의 작업내용을 동기화 메소드로 작성한 공유 객체

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기상태로 만듬 
        try {
            wait(); // ThreadA를 일시 정지 상태로 만듬 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기상태로 만듬
        try {
            wait(); // ThreadB를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//A시스아웃 -> 노티파이로 B 실행대기 -> A정지 -> B실행