package chap11;

public class test0102 {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];

		/*
		 * arr2[0][0] = 1; arr2[0][1] = 2; // arr2[0][2] = 0; arr2[1][0] = 3; arr2[1][1]
		 * = 4; arr2[1][2] = 5;
		 */

		int[][] arr = new int[2][];// 2행짜리
		arr[0] = new int[2];// 1행에 한칸
		arr[1] = new int[3];// 2행에 3칸
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 5;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
