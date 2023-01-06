package chap12;

//3! 의 값은? n!의 메서드 만들기

public class ExerciseFactorial {

	public static void main(String[] args) {
		factorial(5);
	}
	public static void factorial(int x) { // fact x에 들어간숫자를 입력받아서

		int i = 1;
		int result = x;
		while (i < x) {
			result *= i;//연속해서 곱한다
			++i;
		}
		System.out.println(result);
		
		int n=5;
		int z = 1;
		
		for(int j=1; j<=n; j++) {
			z = z*i;
		} 	
		System.out.println(z);
		
		
	}

	
}
