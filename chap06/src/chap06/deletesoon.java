package chap06;

import java.util.Scanner;

public class deletesoon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		int i = 1;
		int result = 0;
		int sum = 0;
		while(i<=sc1) {
			result = i *3;
			sum += result;
			i++;
		}
		System.out.println(sum);
		} 

	}


