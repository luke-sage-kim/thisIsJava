package testPage295;
//메소드 오버라이딩 테스트
public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		//카큘레이터에있는거 실행

		Computer computer = new Computer();
		System.out.println("원 면적 : " +  computer.areaCircle(r));
	}//컴퓨터에있는거 실행
}
