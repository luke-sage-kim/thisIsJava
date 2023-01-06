package testPage410;
//UI 프로그램에서 흔히 사용되는 버튼의 클릭 이벤트 처리를 익명 구현 객체를 이용해서 처리하는방법

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();

	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() { //인터페이스 가져와
		@Override
		public void onClick() {  //인터페이스에있는 온클릭메소드사용
			System.out.println("전화를 겁니다.");			//온클릭을 재정의
		}
	};

	// 생성자
	public Window() {
		button1.setOnClickListener(listener); // 매개값으로 필드 대입 필드로 선언한 익명구현객체가 담당
		
		button2.setOnClickListener(new Button.OnClickListener() { //셋온클릭리스너를 호출시 매개값으로 준 익명
			// 매개값으로 익명 구현 객체 대입
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
