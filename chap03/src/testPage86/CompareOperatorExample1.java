package testPage86;
//비교 연산자
public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);  //두 피연산자의 값이 같은지
		boolean result2 = (num1 != num2); // 두 피연산자의 값이 다른지
		boolean result3 = (num1 <= num2);  //이상 이하
		System.out.println("result1="+ result1);
		System.out.println("result2="+ result2);
		System.out.println("result3="+ result3);

	char char1 = 'A';	
	char char2 = 'B';	
	boolean result4 = (char1 < char2);   //유니코드 a가 65이고 b가 66라서 결과값이 b가 더 큼
	System.out.println("result4=" + result4);

	}
	
}
