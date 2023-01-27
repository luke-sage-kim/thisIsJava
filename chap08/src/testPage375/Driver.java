package testPage375;

import testPage373.Bus;
import testPage373.Vehicle;


//객체 타입 확인
public class Driver {
	public void drive(Vehicle vehicle) {  //버스객체 택시객체
		if(vehicle instanceof Bus) {//비클 매개변수가 참조하는 객체가 버스인지 조사
			Bus bus = (Bus) vehicle;//버스객체일 경우 안전하게 강제타입변환시킴
			bus.checkFare();//버스타입으로 강제변환하는이유
	}
		vehicle.run();
	}
}
