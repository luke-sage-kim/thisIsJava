package testPage350;

//구현 클래스
//인터페이스 구현
public class Television implements RemoteControl{  //implements 인터페이스 구현한다
	private int volume;
	
	//turnOn   //인터페이스구현클래스들은 인터페이스 메소드들을 가지고 있어야함
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	

}
