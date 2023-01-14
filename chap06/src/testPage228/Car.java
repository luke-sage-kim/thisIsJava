package testPage228;
//클래스 외부에서 메소드 호출

public class Car {
	// 필드
	int speed;//....................(5)

	// 생성자

	// 메소드
	//메소드는 객체에 소속된 멤버이므로 객체가 존재하지 않으면 메소드도 존재하지 않아서 
	//클래스로부터 객체를 생성해야한다
	void setSpeed(int speed) {//........................(4)
		this.speed = speed;
	}

	int getSpeed() {
		return speed;//.........................(6)
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {  //(2)
		for(int i = 10; i <= 50; i+=10) {
			// speed = i;
			setSpeed(i); //................................(3)
			System.out.println("달립니다.(시속:" + speed + "km/h");
		}
	}
}
