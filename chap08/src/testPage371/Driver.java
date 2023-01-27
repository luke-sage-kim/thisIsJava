package testPage371;
//매개 변수의 인터페이스화
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
}
}

//드라이브 메소드는 비클 타입을 매개 변수로 선언했지만
//비클을 구현한 버스객체가 매개값으로 사용되면 자동타입변환이 발생한다