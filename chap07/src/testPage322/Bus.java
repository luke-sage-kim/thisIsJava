package testPage322;
//자식 클래스
public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");//차량이 달리는게 버스로
	}
}
