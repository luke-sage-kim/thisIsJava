package testPage228;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	myCar.keyTurnOn();//(1)
	myCar.run();//(2)  객체가 생성되서 도트연산자를 사용해서 메소드를 호출할 수 있다.

	int speed = myCar.getSpeed();//(3)
	System.out.println("현재 속도: " + speed + "km/h");
}
}
