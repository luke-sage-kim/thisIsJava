package chap04;

public class ForSum {

	public static void main(String[] args) {
		
		int sum = 0;
		int i=0;
		for ( i = 0; i <=100; i++) {
			if(i%2 == 0) 
				sum = sum + i;
		}
		System.out.println("1~100의 합은"+"\t"+sum); 
			
		
	}
}
