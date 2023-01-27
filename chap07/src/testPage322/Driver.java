package testPage322;
//Vehicle을 이용하는 클래스

//매개변수의 다형성

//매개값을 다양화하기 위해 매개변수에 자식 타입 객체를 지정할 수도 있다
public class Driver {
	public void drive(Vehicle vehicle) { // drive method vehicele에있는 런을 작동시킨다

		vehicle.run();// 비클런 작동
		// drive 메소느는 비클 타입을 매개변수로 선언했지만 비클을 상속받는 버스객체가 매개값으로 사용되면
		// 자동 타입 변환이 발생한다
	}
}
//매개 변수의 타입이 클래스일 경우 해당 클래스의 객체뿐만 아니라 자식 객체까지도 매개값으로 사용할 수 있다