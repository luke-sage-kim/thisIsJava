package testPage598;
//타겟 스레드
//10억번 루필을 돌개해서 RUNNABLE상태를 유지하고 sleep메소드 호출해서 waiting상태 유지
//다시 10억번 루핑 러너블 상태 유지
public class TargetThread extends Thread{
	
	@Override
	public void run() {
		
		for(long i=0; i<1999999999; i++){}
			// RUNNABLE 상태 유지
		
		try{
			Thread.sleep(1500); // 1.5 초간 TIMED_WAITING 상태 유지
		}catch(Exception e){}
		
		for(long i=0; i<1999999999; i++){}
			// RUNNABEL 상태 유지
		
		
	}
}