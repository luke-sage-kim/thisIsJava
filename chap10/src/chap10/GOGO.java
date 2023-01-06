package chap10;

public class GOGO {
	
		public static void main(String[] args) {

			int[] arr = new int[] { 1, 2, 3 };

			try {
				for (int i = 0; i <= 3; i++) {
					System.out.println(arr[i]);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 넘어섰습니다.");
			} finally {
				System.out.println("수고하셨습니다.");
			}

		
	}}

