package testPage233;

//인스턴스 멤버와 this
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("롤스로이스");
		Car yourCar = new Car("다마스");

		myCar.run();
		yourCar.run();

	}
}
