package testPage236;
//정적멤버사용
public class CalculatorExample {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;  //카큘4 파이를 사용한다 스태틱을 사용해서 뉴뉴거리지않아도 됨
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println(Math.PI);//파이
		int num = (int) (Math.random()*6)+1 ;
		System.out.println(num);//
	}
	
}
