package testPage120;

public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 11; i++) {
			if (i % 2 != 0) {  //짝수면
				continue;
			}
			sum += i;

			System.out.println(i);
		}
	}
}
