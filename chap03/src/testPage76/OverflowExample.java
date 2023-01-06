package testPage76;
//오버플로우

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000; //int로하면 쓰레기값 -7283781머시기나옴
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
		
	}
}
