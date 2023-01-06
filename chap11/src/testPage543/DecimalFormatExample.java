package testPage543;

import java.text.DecimalFormat;
//숫자를 원하는 형식으로 출력
public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		//0
		DecimalFormat df = new DecimalFormat("0");//10진수 빈자리는 0으로채움 
		System.out.println("0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println( df.format(num));
		
		//#
		System.out.println("#");

		df = new DecimalFormat("#");//10진수 빈자리는 채우지 않음
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println( df.format(num));
		//.
		df = new DecimalFormat("#.0");
		System.out.println( df.format(num));
		
		//-음수 기호
		System.out.println("-");

		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num));
	
		//지수 문자
		System.out.println("E");

		df = new DecimalFormat("0.0E0");
		System.out.println( df.format(num));
		System.out.println();

		//양수와 음수의 패턴을 모두 기술할 경우, 패턴 구분자
		System.out.println("양수와 음수 모두기술");

		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num));
		
		System.out.println();
		// 100을 곱한 후에 % 문자 붙임
		System.out.println("%");

		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num));
		System.out.println();

		//통화기호
		System.out.println("통화기호");

		df = new DecimalFormat("\u00A4 #,###");
		System.out.println( df.format(num));
	}



}
