package testPage298;

public class SupersonicAirplanExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();  //Airplane에있는 take off 발동..........(1)
		sa.fly();  //..................(2)
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("초음속 비행 모드로 변경합니다.");
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		System.out.println("일반 비행 모드로 변경합니다.");
		sa.fly();
		sa.land();
	}
}
