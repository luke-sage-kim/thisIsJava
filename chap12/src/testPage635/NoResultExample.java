package testPage635;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 

//리턴값이 없는 작업 완료통보

public class NoResultExample {
 
    public static void main(String[] args) {
       
        //고정된 쓰레드 겟수 생성하는 Executors.newFixedThreadPool 쓰레드 개수가 CUP코어 이상으로 가면 병렬처리 불 가능 하기에 시분할처리 된다.
        ExecutorService executorService = Executors.newFixedThreadPool(
        		Runtime.getRuntime().availableProcessors()
        		);
             
        System.out.println("작업 처리 요청");
     
        Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				//스레드가 처리할 작업내용
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum+= i;
				}System.out.println("처리 결과"+sum);
				// TODO Auto-generated method stub
				
			}
		};
     
        Future future = executorService.submit(runnable);
        						//스레드가 작업처리를 정상적으로 완료했는지 작업 처리 도중에 에외가 발생했는지 확인
       
   
            try {
                future.get();
                System.out.println("작업 처리완료");
            } catch (Exception e) {
               System.out.println("실행예외발생"+e.getMessage());
               
            }
            executorService.shutdown();
        }
}