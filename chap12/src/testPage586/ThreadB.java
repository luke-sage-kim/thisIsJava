package testPage586;

public class ThreadB extends Thread {
	public void run() {
		for(int i =0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
//셋네임안해서 -1 로 표기됨