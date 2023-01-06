package chap05;

public class test202212192 {

	public static void main(String[] args) {
		int[][] javaScores = { { 1, 2, 3}, { 4, 5, 6 } };
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.print("test[" + i + "][" + k + "]=" + javaScores[i][k] + " ");
			}
			System.out.println();
		}
	}
	
}
