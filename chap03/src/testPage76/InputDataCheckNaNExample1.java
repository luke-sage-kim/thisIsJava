package testPage76;
//NaN 문자열의 문제점
public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		
		String userInput = "NaN";  // 사용자로부터 입력받은 값
		double a = Double.valueOf(userInput); // 입력값을 double 타입으로 변환
//더블.벨류메소드에 의해 더블타입으로 변환되면 Nan이된다
		double b = 10000.0;

		b += a; // b에 NaN이 저장됨
		System.out.println(b);
	}

}
