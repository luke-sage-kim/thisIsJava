package testPage366;
//필드 다형성 테스트
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();//생성자
		myCar.run();

		myCar.tires[0] = new KumhoTire(); //0번쨰에 금호
		myCar.tires[1] = new KumhoTire();//1번쨰에 금호
	

		myCar.run();
	}
}
