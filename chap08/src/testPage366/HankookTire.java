package testPage366;

public class HankookTire implements Tire {
	@Override
	public void roll() { // Tire 인터페이스 구현
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
//한국타이어는 타이어 인터페이스를 구현했기 떄문에 모두 타이어 인터페이스에있는ㄴ
//메소드를 가지고 있다. 따라서 타이어 인터페이스로 동일하게 사용할 수있는
//교체가능한 객체에 해당한다.