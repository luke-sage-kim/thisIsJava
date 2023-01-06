package testPage350;

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
