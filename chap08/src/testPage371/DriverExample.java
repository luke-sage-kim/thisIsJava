package testPage371;



//매개 변수의 다형성 테스트
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); //생성자

		Bus bus = new Bus();//생성자
		Taxi taxi = new Taxi();

		driver.drive(bus); // 자동 타입 변환 Vehicle vehicle = bus;
		driver.drive(taxi);
	}
}
