package testPage76;
//정확한 계산은 정수사용
public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면.");
		System.out.println(result + "조각이 남는다.");
	}//이진 포맷의 가수를 사용하는 부동소수점 타입은 0.1을 정확히 표현할 수 없어 근사치로 처리한다
		//고로 정확한 계산 필요시 AccuracyExample2 처럼 정수 연산으로 변경하여야한다
}
