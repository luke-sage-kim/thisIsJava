package chap06;

public class Car4 {
	// 필드
	String model;   //model 이라는 객체 선언
	int speed;			//speed라는 정수 선언

	// 생성자 
	Car4(String model) {     //자동차 모델을 받는다
		this.model = model;  //받은 모델이름을 this.model에 저장
	}

	// 메소드
	void setSpeed(int speed) { //setSpeed 함수선언    이거안하면 위험하다
		this.speed = speed;  //this에 speed를 집어넣어라
	}
	


	void run() {
		for (int i = 10; i <= 300; i += 100) {  //10씩 증가하는 포문
			this.setSpeed(i);   //setSpeed 메소드 실행
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}
