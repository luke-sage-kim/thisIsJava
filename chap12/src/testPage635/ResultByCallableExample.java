package testPage635;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 //리턴값이 있는 작업완료 통보
public class ResultByCallableExample {
 
    public static void main(String[] args) {
       
        ExecutorService executorService = Executors.newFixedThreadPool(
        		Runtime.getRuntime().availableProcessors()
        		);
       
        System.out.println("[작업처리 요청]");
       
        Callable<Integer>task = (new Callable<Integer>() {
        	//스레드가 작업을 완료한 후에 애플리케이션이 처리 결과를 얻어야할떼 쓰는 컬러블
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i=1; i<=10; i++) {
                    sum += i;                                
                }
                //나갈때 Integer로 오토박싱 되어 나간다.
                return sum;
            }
        });
       
        Future<Integer> future = executorService.submit(task);
       
                try {
                	int sum  = future.get();
                System.out.println("[처리결과] "+sum);
                System.out.println("[작업처리완료]");
                	
                	
                   
                } catch ( Exception e) {
                    System.out.println("실행예외발생"+e.getMessage());
                }                                    
       
        executorService.shutdown();
        System.out.println("Main 스레드 종료");
    }
 
}