package testPage402;
//중첩 인터페이스
public class Button {
private	OnClickListener listener; // 인터페이스 타입 필드

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {  //터치실행될때 인터페이스를 통해 구현객체의 메소드를 호출한다
		listener.onClick();
	}

	/** 중첩 인터페이스 **/  //해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해서이다.
	interface OnClickListener {    //버튼 내부에 선언된 중첩 인터페이스를 구현한 객체만 받아야한다
		void onClick();
	}
}
