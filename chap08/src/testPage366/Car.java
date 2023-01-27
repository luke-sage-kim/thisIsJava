package testPage366;


//필드 다형성



public class Car {
	// 인터페이스 타입 필드 선언과 초기 구현 객체 타입 //인터페이스 배열로 구현객체관리
		Tire[] tires = {//......................(2)
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
		};

		void run() { // 인터페이스에서 설명된 roll() 메소드 호출
			for(Tire tire : tires) {//..............(1)
				tire.roll();
			}
		}//향상된 포문 첫번째부터 끝까지해줌
}
