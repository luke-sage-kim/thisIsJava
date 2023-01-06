package chap05;

public class test140 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1 ;a<=100 ; a++){
			if(a%10 !=0) {
				continue;
			} 
			sum += a;
			System.out.println(sum);
			
		}
	}
}
