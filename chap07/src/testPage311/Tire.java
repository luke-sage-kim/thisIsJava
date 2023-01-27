package testPage311;
//타이어 클래스
public class Tire {
	// 필드
		public int maxRotation;  // 최대 회전수(타이어 수명)
		public int accumulatedRotation; // 누적 회전수
		public String location; // 타이어의 위치

		// 생성자
		public Tire(String location, int maxRotation) {
			this.location = location;  //디스로 지정
			this.maxRotation = maxRotation;
		}

		// 메소드
		public boolean roll() { //회전
			++accumulatedRotation;  // 누적 회전수 1증가
			if(accumulatedRotation < maxRotation) {  //누적회전수랑 최대회전수 비교
				System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
				return true;
			} else {
				System.out.println("*** " + location + " Tire 펑크 ***");
				return false;
			}
		}
}
