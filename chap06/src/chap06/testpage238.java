package chap06;

public class testpage238 {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator4.pi;  //카큘4 파이를 사용한다 스태틱을 사용해서 뉴뉴거리지않아도 됨
		int result2 = Calculator4.plus(10, 5);
		int result3 = Calculator4.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println(Math.PI);//파이
		int num = (int) (Math.random()*6)+1 ;
		System.out.println(num);//
	}
	
}
