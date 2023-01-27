package testPage332;

//추상클래스
//추상클래스는 new연산자를 이용해서 객체를 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다


public abstract class Phone {   //앱스트랙트 설정시 익스플로러에 파일에 A가 붙네 ㅎ
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
