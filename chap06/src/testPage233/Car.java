package testPage233;

public class Car {
	// 클래스 외부에서 메소드 호출
	// 필드
	String model;
	int speed;// 

	// 생성자

	Car(String model) {
		this.model = model;
	}

	// 메소드
	// 메소드는 객체에 소속된 멤버이므로 객체가 존재하지 않으면 메소드도 존재하지 않아서
	// 클래스로부터 객체를 생성해야한다
	void setSpeed(int speed) { //스피드라는 변수를 받는 메소드 리턴없다
		this.speed = speed;
	}

	void run() { 
		for (int i = 10; i <= 50; i += 10) {

			setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:" + speed + "km/h)");
		}
	}
}
