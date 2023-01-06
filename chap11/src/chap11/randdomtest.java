package chap11;

import java.util.Random;

public class randdomtest {
	public static void main(String[] args) {
		Random r = new Random(1234);//종자값을 넣는다
		//seed(씨앗)을 사용한다면 컴퓨터는 계속 같은 패턴의 난수를 생성하게 됩니다.
		int[] arr = new int[5];
		int max = 0;
		for(int i : arr) {
			arr[i] = r.nextInt(1, 11);
			if(arr[i]>max) {
				max = arr[i];
			}
			System.out.println(arr[i]);
		}
		System.out.println("최대값은 "+max+"입니다.");
	} 
			
	} 

