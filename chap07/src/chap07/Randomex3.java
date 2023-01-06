package chap07;

import java.util.Random;

public class Randomex3 {
	public static void main(String[] args) {
//5개의 랜덤숫자를 담은 배열
		Random random = new Random(); // seed
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = random.nextInt(1, 11);//1부터 10까지 랜덤 숫자 뽑기
			System.out.println(arr[i]);
		}
	}
}
