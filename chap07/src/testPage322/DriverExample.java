package testPage322;
//실행 클래스 매개 변수의 다형성
public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver(); //생성자
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(vehicle);//드라이버 클래스에 드라이브 메소드 비클넣어서 실행
		driver.drive(bus);
		driver.drive(taxi);

	}
}
