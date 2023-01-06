package chap02;

public class testpage56 {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;  //더블이면 0 float이면 -4
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
