package testPage214;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); //Calculator에서 가져오겠다
		myCalc.powerOn();  //파워온을 실행시킨다.

		int result1 = myCalc.plus(5,  6); //5랑 6이 arguments 이다 
		System.out.println("result1 : " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);

		
		
		int result3 = myCalc.multiple(10, 4);
		System.out.println("result3 : " + result3);
		
	//	System.out.println(myCalc.arrayMethod(3,2,1,0,5,4));
		
		System.out.println(myCalc.sum(3,2,1));
		
		myCalc.powerOff();
	}
}
