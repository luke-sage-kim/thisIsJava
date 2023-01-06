package chap10;

import java.util.Scanner;

public class Exercise1 {
	static final double PI = 3.14;

	public static void main(String[] args) {

		// int r = 8;
		// double r3 = Math.pow(r, 3); //제곱
		// System.out.println(4 * PI * r3/ 3);

	//	System.out.println("반지름을 입력하세요");
	//	Scanner superscan = new Scanner(System.in);
	//	int q = superscan.nextInt();
	//	double q3 = Math.pow(q, 3); // 제곱
	//	System.out.println(4 * PI * q3 / 3);

		//글자를 입력받아서 부장님 차장님 사원이면
		System.out.println("이름을 입력하세요");
		Scanner superscan = new Scanner(System.in);
		String q = superscan.nextLine();
		switch (q) {
		case "진양철":
			System.out.println(q+"회장님의 급여는 20억원입니다.");
			break;
		case "진영기":
			System.out.println(q+"부회장님의 급여는 10억원입니다.");
			break;
		case "진성준":
			System.out.println(q+"차장님의 급여는 5억원입니다.");
			break;				
		default:
			System.out.println("이름을 다시 입력하여주십시오");
			break;
		}
	}
}
