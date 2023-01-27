package testPage493;
//수신 클래스
public class ReceiveAction implements Action{
	//Action 인터페이스의 execute()메소드 오버라이딩
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}