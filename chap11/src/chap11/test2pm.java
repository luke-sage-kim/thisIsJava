package chap11;

import java.util.Arrays;

public class test2pm {
	public static void main(String[] args) {

		int[][] arr2 = new int[2][3];

		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 4;
		arr2[1][0] = 1;
		arr2[1][1] = 2;
		arr2[1][2] = 3;
	

	//	System.out.println(arr2.length);  //행 갯수
	//	System.out.println(arr2[0].length); //0행 길이
		//System.out.println(arr2[1].length); //1행 길이
		
	//	for(int i=0; i<arr2.length; i++) {
	//		for(int j=0; j<arr2[i].length; j++) {
	//			System.out.println("["+i+"]["+j+"] = " +arr2[i][j] );
		//	}
	//	}
		//System.out.println(Arrays.toString(arr2[0]));
		//System.out.println(Arrays.toString(arr2[1]));
		System.out.println("구구단을 외우자");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" 곱하기 "+j + " = " +i*j);
			}
		} 
		
		
	}
}
