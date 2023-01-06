package testPage76;
//NaN과 Infinity 연산
public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// Infinity 와 NaN
		
				int x = 5;
				double y = 0.0;

				double z = x / y;
				// double z = x % y;

				System.out.println(Double.isInfinite(z));//프로그램에서 /%결과가 인피 난인지 확인하는메소드
				System.out.println(Double.isNaN(z));

			//	if (Double.isInfinite(z) || Double.isNaN(z)) { //둘중하나가 참이면 고우~
		//			System.out.println("값 산출 불가");
		//		} else {
					System.out.println(z + 2); // 문제가 되는 코드
					// Infinity + 2 -> Infinity,  NaN + 2 -> NaN
			//	}
			}

}
