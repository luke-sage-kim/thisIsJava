package chap12;

import java.util.Iterator;

public class factorial2 {
	public static int factorial(int n) {  //n에 숫자 대입0
		int multiple = 1;
		for (int i = 1; i <= n; i++)
		if(n == 1) return 1;
		
		multiple = n * factorial(n-1);
		return multiple;
		} 
	public static void main(String[] args) {
		System.out.println(factorial(5));
		}
}
