package testPage120;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {  //스트링 타입의 배열들이구나
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		};
		int sum = 0;
		int z = 1;
		while(z<=100) {
			sum += z;
			z++;
		}
		System.out.println("1~"+(z-1)+"합:"+sum);
		
		
	
	}
	
}
