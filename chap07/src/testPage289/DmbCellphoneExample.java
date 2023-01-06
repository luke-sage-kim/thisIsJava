package testPage289;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		// testpage291 객체 생성
		DmbCellphone a = new DmbCellphone("갤럭시S22+", "팬텀블랙", 10); //어레이선언 290에 

		// CellPhone으로부터 상속받은 필드
		System.out.println("모델: " + a.model);  //291 디스 에있는거 부모에있음
		System.out.println("색상: " + a.color);

		// testpage291의 필드
		System.out.println("채널: " + a.channel);//자식한테 가져온거

		// 부모로 부터 상속받은 메소드 호출
		a.powerOn();
		a.bell();
		a.sendVoice("여보세요");  //290사용
		a.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		a.sendVoice("아~ 예 반갑습니다.");
		a.hangUp();

		// testpage291의 메소드 호출
		a.turnOnDmb();
		a.changeChannelDmb(12);
		a.turnOffDmb();
	}
}
