package testPage311;

public class Car {
	// 필드
		Tire frontLeftTire = new Tire("앞왼쪽",0); //타이어 필드에 숫자
		Tire frontRighttTire = new Tire("앞오른쪽",6);
		Tire backLeftTire = new Tire("뒤왼쪽",6);
		Tire backRightTire = new Tire("뒤오른쪽",6);
		
	/*
	 * Tire[] tires = { //배열 선언 new Tire("앞왼쪽", 300), //타이어객체 생성해서 넣는것 new
	 * Tire("앞오른쪽", 300), new Tire("뒤왼쪽", 300), new Tire("뒤오른쪽", 300), };
	 */

		// 메소드

		int run() {
			System.out.println("자동차가 달립니다.");
			if (frontLeftTire.roll()==false) {stop(); return 1;} //이프문 검토 롤함수 실행 팔스면 멈추는 메소드 실행
			if (frontRighttTire.roll()==false) {stop(); return 2;}// 멈추는 메소드 실행과 case1로 갑니다
			if (backLeftTire.roll()==false) {stop(); return 3;}
			if (backRightTire.roll()==false) {stop(); return 4;}
			
			/*
			 * for(int i=0; i<tires.length; i++) { //배열 크기만큼 반복 if(tires[i].roll() == false)
			 * { stop(); return (i+1); } }
			 */
			return 0;
		}

		void stop() {
			System.out.println("[자동차가 멈춥니다.]"); // 펑크 났을 때 멈춤
		}
}
