package testPage334;
//추상 메소드 선언
public abstract class Animal {
	public String kind;  //종

	public void breathe() {   //숨쉬는
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드 선언
	public abstract void sound();  // 실행 내용 {}은 없고 선언부만 있음.
}
