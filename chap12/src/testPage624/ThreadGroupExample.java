package testPage624;

//스레드 그룹을 이용한 일괄 종료 예제
public class ThreadGroupExample {
	 
    public static void main(String[] args) {
        //    myGroup에 두 스레드를 포함시킵니다.
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
        
        workThreadA.start();
        workThreadB.start();
        
        System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
//        [ main 스레드 그룹의 list() 메소드 출력 내용 ]
//        		java.lang.ThreadGroup[name=main,maxpri=10]
//        		    Thread[main,5,main]
//        		    java.lang.ThreadGroup[name=myGroup,maxpri=10]
//        		        Thread[workThreadA,5,myGroup]
        					//스레드이름 우선순위 소속그룹
//        		        Thread[workThreadB,5,myGroup]
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();
        
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        
        System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
        myGroup.interrupt();
    }
}