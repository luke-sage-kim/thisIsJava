package testPage120;
//구구단 출력하기
public class ForMultiplicationTableExample {
public static void main(String[] args) {
	
	for (int m=1; m<=9;m++) {
		System.out.println(m+"단입니다.");

		for (int j=1; j<=9;j++) {
			System.out.println(m+"곱하기"+j+"는"+m*j);
		}
		
		System.out.println("\n");
	}
}
}
