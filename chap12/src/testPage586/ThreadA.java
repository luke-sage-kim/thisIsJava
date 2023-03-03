package testPage586;

public class ThreadA extends Thread {
	public ThreadA () {
		setName("ThreadA");//set name 해줘야 이름설정
	}
	
	public void run() {
		for(int i=0; i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
	
	
	
}
