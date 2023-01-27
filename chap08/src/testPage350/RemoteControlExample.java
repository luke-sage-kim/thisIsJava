package testPage350;

//인터페이스 변수에 구현 객체 대입

public class RemoteControlExample {
public static void main(String[] args) {
	RemoteControl  //인터페이스 소환
	rc = new Television();
	
	rc.turnOn();  
	rc.turnOff();
	
	rc = new Audio();
	rc.turnOn();
	rc.turnOff();
}
}
