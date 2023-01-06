package testPage311;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for(int i=1; i<=500; i++) {//시스아웃할떄 500번씩나눠서 되는지?
			int problemLocation = car.run();
			
			switch(problemLocation){ //타이어 교체
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체 ");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);//필드에 새로 15를 넣는다
				break;
			case 2:
				System.out.println("앞왼쪽 HankookTire로 교체 ");
				car.frontRighttTire = new HankookTire("앞오른쪽",15);
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire로 교체 ");
				car.backLeftTire = new HankookTire("뒤왼쪽",15);
				break;
			case 4:
				System.out.println("앞왼쪽 HankookTire로 교체 ");
				car.backRightTire = new HankookTire("뒤오른쪽",15);
				break;
		
			}
			
			
			/*if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}*/
			System.out.println(i+"번 달렸습니다");
			System.out.println("----------------------------------"); // 1회전 시 출력되는 내용 구분
			
		}
	}
}

 
 