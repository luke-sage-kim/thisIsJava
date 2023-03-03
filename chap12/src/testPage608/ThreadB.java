package testPage608;

//WorkObject의 methodB()를 실행하는 스레드

public class ThreadB extends Thread{
    private WorkObject workObject;

    ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    
    public void run() {
        for(int i=0; i<10; i++) {
            workObject.methodB(); // 공유객체의 methodA를 반복적으로 호출 
        }
    }
}