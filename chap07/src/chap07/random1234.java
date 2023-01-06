package chap07;

import java.util.Random;

public class random1234 {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println(random.nextInt(1,7));
		System.out.println(random.nextInt(1,7));
		System.out.println(random.nextInt(1,7));
	}
}
