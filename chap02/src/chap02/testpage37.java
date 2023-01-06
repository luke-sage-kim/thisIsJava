package chap02;

public class testpage37 {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10; // v2는 블럭 안의 지역 변수
			System.out.println("v2 = " + v2);
		}
		System.out.println("v1 = " + v1);
//		int v3 = v1 + v2 - 5;  // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		//왜냐하면 v2는 이프문 안에서 선언된 변수라 이프문 밖이면 안되기때문이다.
	}
}
