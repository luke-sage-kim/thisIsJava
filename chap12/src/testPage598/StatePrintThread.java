package testPage598;

public class StatePrintThread extends Thread{
	// 타겟 스레드의 상태를 출력하는 스레드
	//생성자 매개값으로 받은 타겟 스레드의 상태를 0.5초 주기로 출력
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
							//상태를 조사할 스레드
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while(true){
			Thread.State state = targetThread.getState();//스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : " + state);
			//스레드 상태 얻기
			
			if(state == Thread.State.NEW){//객체 생성 상태일 경우
				targetThread.start(); // 	실행대기 상태로 만듬
			}
			
			if(state == Thread.State.TERMINATED){	//종료 상태일 경우
				break;								//while문을 종료함
			}
			
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}