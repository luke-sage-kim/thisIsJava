package testPage222;

public class Car {
		// 필드
		int gas;  //가스라는 필드  객체의 고유 데이터 부품 객체 상태 정보를 저장하는 곳 모든가스건드리는것이 다 얘임  page224에서 받은 5를 여기에저장

		// 생성자  //없음

		// 메소드
		void setGas(int gas) { //리턴없는것   (1)
			this.gas = gas;   //this란 나를 지칭하기위한것
		}
		// 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를 0이 아니면 true를 리턴
		boolean isLeftGas() {
			if(gas == 0) {
				System.out.println("gas가 없습니다.");
				return false; // false를 리턴
			}
			System.out.println("gas가 있습니다."); //(2)
			return true;  // true를 리턴
		}

		// 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문이 메소드로 강제 종료
		void run() {     //(3)
			while(true) {
				if(gas > 0) {
					System.out.println("달립니다.(gas 잔량:" + gas + ")");
					gas -= 1; //트루라서 가스 하나뻄
					/*if(gas == 1) {
						System.out.println("멈춥니다.(gas 잔량:" + gas + ")");    //"gas를 주입할 필요가 없습니다."넣기 위해 새로 추가한것
						return; // 메소드 실행 종료
					}*/
				} else {
					System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
					return; // 메소드 실행 종료
				}
			}
		}
	}
