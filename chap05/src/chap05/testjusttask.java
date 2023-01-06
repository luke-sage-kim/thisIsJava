package chap05;

public class testjusttask {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;
		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;

		for (int[] array : scores) {    //행을 가져온다
			for (int score : array) {
				System.out.println(score);
			}
		}

	}
}
