package chap07;

import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(
			System.in
			);
			int age = sc.nextInt();
			switch (age/10) {
			case 1:
				System.out.println("10대입니다");
				break;
			case 2:
				System.out.println("20대입니다");
				break;
			case 3:
				System.out.println("30대입니다");
				break;
			case 4:
				System.out.println("40대입니다");
				break;

				
			default:
				System.out.println("그 이상");
				break;
	}



}
}
