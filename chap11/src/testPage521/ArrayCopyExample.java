package testPage521;

import java.util.Arrays;

//배열복사
public class ArrayCopyExample {
	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' }; // 배열생성

		
		// 방법1 arr1전체를 arr2로 복사
		System.out.println("방법1");
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));

		// 방법2 부분복사    
		System.out.println("방법2");

		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);//복사할 범위를 정한다
		System.out.println(Arrays.toString(arr3));

		// 방법3 전체복사
		System.out.println("방법3");
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); //시스템 arraycopy메소드 출력문아님!
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr[" + i + "]=" + arr4[i]);//이게출력이지
		}
	}
}
