package chap05;

public class ArrayinArrays {

	public static void main(String[] args) {
		//int [][] scores = new int[2][3];
	//	System.out.println(scores.length); // 다차원 배열 스코어가 6개인데 왜 2가 나올까
		// System.out.println(scores[0][0]); //(0.0)의 내용 보여줌
	//	System.out.println(scores[0].length); // 가로의 갯수를 알려줌
	//	System.out.println(scores[1].length); // 가로의 갯수를 알려줌
		
		///////////////////////////////////////////////////////////////////
		int[][] scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		
		System.out.println(scores.length); // 다차원 배열 스코어가 6개인데 왜 2가 나올까
		// System.out.println(scores[0][0]); //(0.0)의 내용 보여줌
		System.out.println(scores[0].length); // 가로의 갯수를 알려줌
		System.out.println(scores[1].length); // 가로의 갯수를 알려줌
		
	
	}
}
