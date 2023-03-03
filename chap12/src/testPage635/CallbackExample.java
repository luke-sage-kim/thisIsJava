package testPage635;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



//콜백 방식의 작업 완료 통보받기
public class CallbackExample {
private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
	}
	//=======================콜백 메소드르 가진  CompletionHandler 객체 생성====================
	private CompletionHandler<Integer,Void> callback = new CompletionHandler<Integer,Void>(){

		@Override //작업을 정상처리 완료했을때
		public void completed(Integer result, Void attachment) {	
			System.out.println("completed() 실행 : "+result);
		}

		@Override  //작업처라 도중 예외 발생
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행 : " + exc.toString());
		}
	};
//==================================================================
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
                    //일련의 작업을 무사히 마치고!
					callback.completed(result, null);
				} catch (Exception e) {
                	//예외가 발생했을 때 호출!
					callback.failed(e, null);
				}
			}
		};
		executorService.submit(task);
	}
	
	public void finish() {
		executorService.shutdown();
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
	

}
