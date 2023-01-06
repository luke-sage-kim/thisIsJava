package testPage410;

public class Button {
	// 인터페이스 타입 필드
		OnClickListener listener; //중첩인터페이스 타입으로 필드를 선언

		void setOnClickListener(OnClickListener listener) {  //셋온클릭리스너로 외부에서 구현 객체를 받아 필드에 대입
			this.listener = listener;
		}

		void touch() {//이벤트 발생시 인터페이스를 통해 구현객체의 메소드를 호출한다.
			listener.onClick();
		}

		/** 중첩 인터페이스 **/
		interface OnClickListener {
			void onClick();
		}
}
