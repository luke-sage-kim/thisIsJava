package test;

public class test232 {
public static void main(String[] args) {
	int sum = 0;
	for(int i=1;i<101;i++) {
		if(i%2==0) {
			sum+= i;
		}else if(i%5==0) {
			sum+=i;
			{
				continue;
			}
	}
	}System.out.println(sum);
}
}
