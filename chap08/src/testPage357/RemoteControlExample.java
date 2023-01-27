package testPage357;
//인터페이스 사용


public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; //인터페이스 변수 선언
		
		rc = new Television();//구현객체대입
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();

		rc = new Audio(); //구현객체대입
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(true);
		//디폴트메소드는 추상 메소드가 아닌 인스턴스 메소드이므로 구현 객체가 있어야 사용할 수 있다
	
	
}
}