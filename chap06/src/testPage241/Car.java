package testPage241;

//정적 메소드와 블록 선언 시 주의할 점
public class Car {
	int speed;//필드
//객체가 없어도 실행된다는 특징 떄문에 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수없다 this도 불가능
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	//정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고 참조변수로 접근해야함
}
