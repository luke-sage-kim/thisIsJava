package testPage410;
//익명 구현 클래스와 객체 생성
public class Anonymous {
	// 필드의 초기값으로 대입
		RemoteControl field = new RemoteControl() {  //클래스 필드선언   인터페이스를 구현해서중괄호{}와같이 클래스를 선언하라
			@Override
			public void turnOn() {  //인터페이스로 인하여  턴온 턴오프 다 넣어야됨
				System.out.println("TV를 켭니다.");
			}

			@Override //인터페이스의 추상메소드에 대한 실체메소드
			public void turnOff() {
				System.out.println("TV를 끕니다.");			
			}
		};

		void method1() {
			// 로컬 변수값으로 대입
			RemoteControl localVar = new RemoteControl() {  //로컬변수선언 인터페이스를 구현해서중괄호{}와같이 클래스를 선언하라
				@Override  //인터페이스의 추상메소드에 대한 실체메소드
				public void turnOn() {
					System.out.println("Audio를 켭니다.");
				}

				@Override  //인터페이스의 추상메소드에 대한 실체메소드
				public void turnOff() {
					System.out.println("Audio를 끕니다.");			
				}
			};
			// 로컬 변수 사용
			localVar.turnOn();   //(1)
			localVar.turnOff();   //(2)
		}
			//리모콘
		void method2(RemoteControl rc) {  
			rc.turnOn();
			rc.turnOff();
		}
}
