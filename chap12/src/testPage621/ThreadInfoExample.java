package testPage621;

import java.util.Map;
import java.util.Set;

import testPage619.AutoSaveThread;


//현재 실행 중인 스레드 정보

public class ThreadInfoExample {
	 
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for(Thread thread : threads) {   //스레드를 하나씩 가져오하 루핑 시킴
            System.out.println("Name: " + thread.getName() +
                    ((thread.isDaemon())?"(데몬)": "(주)"));
            System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}