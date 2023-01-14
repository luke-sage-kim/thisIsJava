package testPage300;

//재정의할 수없는 final 메소드
public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}

	//오버라이딩을 할수 없음

//	public void stop() { // 컴파일 에러 발생
//		System.out.println("스포트카를 멈춤");
//		speed = 0	}
}
