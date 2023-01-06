package chap06;

public class testpage268 {
public static void main(String[] args) {
	Car6 myCar = new Car6();  //객체선언
	
	//잘못된 속도 변경
	myCar.setSpeed(-50);
	
	System.out.println("현재속도"+myCar.getSpeed());
	
	//올바른 속도 변경
	myCar.setSpeed(60);
	System.out.println("현재속도"+myCar.getSpeed());

	//멈춤
	if(!myCar.isStop()) {
		myCar.setStop(true);
	}
	System.out.println("현재속도"+myCar.getSpeed());
	
}
}
