package testPage222;
//return 문
public class CarExample
{
	public static void main(String[] args) {
		Car myCar = new Car();//생성자

		myCar.setGas(5); // Car의 setGas() 메소드 호출; (1)

		boolean gasState = myCar.isLeftGas();  // (2)Car의 isLeftGas() 메소드 호출
		if(gasState) {   //아무말없으면 true
			System.out.println("출발 합니다.");
			myCar.run(); // Car의 run() 메소드 호출 (3)
		}

		if(myCar.isLeftGas()) { //(4) 이즈레프트 한번더
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
