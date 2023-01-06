package testPage350;

public class Audio implements RemoteControl {
	private int volume;

	// 추상 메소드의 실체 메소드 구현

	public void turnOn() {
		System.out.println("Audio를 켭니다.");		
	}


	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}


	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}
