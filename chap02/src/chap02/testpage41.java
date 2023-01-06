package chap02;

public class testpage41 {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++ ) { // for 중괄호 {}블록 5회 반복 실행
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}//3번째 칸부터 byte넣은거는 127까지라 다시 -128부터 시작하는것이다
