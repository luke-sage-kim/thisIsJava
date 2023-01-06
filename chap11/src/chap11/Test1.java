package chap11;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		/*
		 * System.out.println("이름을 입력하세요"); Scanner superscan = new Scanner(System.in);
		 * String q = superscan.nextLine();
		 */
		// System.out.println("나의 이름은"+q+"이고, 나이는 "+w+"세 입니다");

		int sum = 0;
		int i =1;
		Scanner scanner = new Scanner(
System.in
);
		
		System.out.println("숫자를 입력하시오 ");
		int number =  scanner.nextInt();
		
		while(number>=i) {
			if(i%3==0) {
				sum+=i;
				i++;
			}else {i++;}
		
		}
		System.out.println( sum);
	}
} 