package testPage86;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false;
		//이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수가 없다
		//0.1000000149011612 대충 요래 표현됨
		System.out.println((float)v4 == v5); // true;
		System.out.println((int)(v4*10) == (int)(v5*10)); // true;
	}
}
