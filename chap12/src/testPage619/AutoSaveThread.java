package testPage619;
//1초주기로 save()메소드를 호출하는 데몬스레드

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("저장합니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
