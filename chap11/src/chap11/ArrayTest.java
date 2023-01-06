package chap11;

import java.util.Arrays;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		//int[] arr5 = {12,11,4,3};  //배열 선언
		//String[] arr5 = {"Hello","Good", "Morning"};
	//	Arrays.sort(arr5);  //정렬   오름차순 숫자뿐만아니라 문자열도 가능하다
	//	System.out.println(arr5[1]);
	//	System.out.println(Arrays.toString(arr5));
		
		int [] arr6 = {2,1,4,3};
		System.out.println(Arrays.binarySearch(arr6, 3));//arr6 중에 3의 주소를 찾아주세요
		//[2] 번째라고 출력하는것이다
		
		
		String[] arr7 = {"Hello","Good", "Morning"};
		System.out.println(Arrays.binarySearch(arr7, "Morning"));
		
	}
}
