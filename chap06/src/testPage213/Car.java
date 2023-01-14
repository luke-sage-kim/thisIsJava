package testPage213;

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
				this(model,"은색",250);//맨밑 호출
			}

			Car(String model, String color) {
				this(model, color,250);//맨밑 호출
			}

			Car(String model, String color, int maxSpeed) {
				this.model = model;
				this.color = color;
				this.maxSpeed = maxSpeed;
			}

	}


