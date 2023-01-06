package testPage357;

public interface RemoteControl {

		// 상수
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;

		// 추상 메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);

		// 디폴트 메소드(Java 8 부터 추가됨.)
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리합니다.");
			} else {
				System.out.println("무음 해제합니다.");
			}
		}
}
