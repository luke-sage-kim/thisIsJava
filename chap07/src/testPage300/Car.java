package testPage300;
// 재정의할 수 없는 final 메소드
public class Car {
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	public final void stop() { // 파이널로 선언해서 스포츠카 클래스 스탑 오버라이딩 불가
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
