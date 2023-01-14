package testPage208;
// 생성자의 오버로딩
//다음은 Car클래스에서 생성자를 오버로딩한 예를 보여준다

public class Car {
	// 필드
		String company = "람보르기니";
		String model;
		String color;
		int maxSpeed;

		// 생성자
		Car() { 
		}

		Car(String model) {    //모델에저장
			this.model = model; //생성자에서 다른 생성자 호출시 사용
		}

		Car(String model, String color) {
			this.model = model;
			this.color = color;
		}

		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}

}
