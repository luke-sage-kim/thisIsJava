package testPage493;
//동적 객체 생성 및 실행
public class NewInstanceExample {
	public static void main(String[] args) {
		//try-catch문 사용 (newInstance()사용시 발생가능 예외 2가지 + ClassNotFoundException까지)
		//SendAction과 ReceiveAction 구현클래스 번갈아가면서 소환
		try {
			//SendAction일 경우
		//	Class clazz = Class.forName("testPage493.SendAction");
			//ReceiveAction일 경우
			Class clazz = Class.forName("testPage493.ReceiveAction");
			
			Action action = (Action) clazz.newInstance(); //강제 타입 변환 해주기
			action.execute(); //Action 인터페이스의 execute()메소드 호출
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}


}	