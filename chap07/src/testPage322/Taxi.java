package testPage322;
//자식 클래스
public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");//차량대신 택시로 바뀜
	}
}
