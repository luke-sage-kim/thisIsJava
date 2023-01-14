package testPage298;

public class SupersonicAirplane extends Airplane {
	//super 변수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() { //..................(2)
		if(flyMode == SUPERSONIC) {
			// System.out.println("초음속 비행 모드로 변경합니다.");
			System.out.println("초음속 비행합니다.");
		} else  {
			
			super.fly();//..................(3)
			// Airplane 객체의 fly() 메소드를 호출
		}

	}
}
