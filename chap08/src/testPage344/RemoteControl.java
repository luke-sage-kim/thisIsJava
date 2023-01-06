package testPage344;

//상수 필드 선언
public interface RemoteControl {
	// 상수상수필드선언
	int MAX_VOLUME = 10; // 인터페이스 내에서는 상수는 반드시 선언과 동시에 값을 지정해야 한다.
	int MIN_VOLUME = 0;

	// 추상메소드 p.348
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드(Java 8 부터 추가됨.) p.349
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드(Java 8 부터 추가됨.) p.350
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
		}
}
