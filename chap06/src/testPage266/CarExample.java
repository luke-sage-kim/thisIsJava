package testPage266;
//getter와 setter 메소드 사용
public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();  //객체선언
	
	//잘못된 속도 변경
	myCar.setSpeed(-50);//.......(1)
	
	System.out.println("현재속도"+myCar.getSpeed());//..............(2)
	
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
