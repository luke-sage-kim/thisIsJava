package chap13;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		FirstPw<String, Integer> firstPw = new FirstPw<String, Integer>("자바", 1234);
		SecondPw<String,Integer > secondPw = new SecondPw<String,Integer >();
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 비밀번호를 입력해주세요 >");
		String strpw = scanner.nextLine();
		System.out.print("두번째 비밀번호를 입력해주세요 >");
		int numpw = scanner.nextInt();

		secondPw.setNum(numpw);
		secondPw.setStr(strpw);
		scanner.close();

		boolean check = Password.<String, Integer>correct(firstPw, secondPw);
		if (check) {
			System.out.println("패스워드가 일치합니다. 금고가 열립니다.");
		} else {
			System.out.println("삐빅 패스워드가 일치 하지 않습니다. 남은 기회 2번");
		}
	}
}