package testPage120;

//1부터 10까지 출력
public class ForPrintFrom1To10Example {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) { // i는 1이고 10이될때까지 1씩더해서 진행시킨다 단독이라 ++위치 상관없다
			 System.out.println(i);
			sum += i;
		//	System.out.println(sum);
		}
		// System.out.println(sum);

	}
}
