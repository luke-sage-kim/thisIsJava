package chap07;

public class Ex1 {

	public static void main(String[] args) {
		//while continue 1~100 모든 3의 배수의 합?
		int i= 1;
		int u = 0;
		int sum = 0;
		
		
		while(i<=100) {
			i++;
			
			if(i%3!=0) {
				continue;
			}
			sum +=i;
		}
		System.out.println(sum);
	}
}
