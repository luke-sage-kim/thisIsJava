package testPage68;

// 비트 반전 연산자
public class BitReverseOperatorExample {
	public static void main(String[] args) {

		int v1 = 1;
		int v2 = ~v1; // byte타입으로 하면 컴파일에러가 발생
		int v3 = ~v1 + 11;

		System.out.println(toBinaryString(v1) + "(십진수:" + v1 + ")");
		System.out.println(toBinaryString(v2) + "(십진수:" + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수:" + v3 + ")");
		System.out.println();

		int v4 = -10;
		int v5 = ~v4; // byte타입으로 하면 컴파일에러가 발생
		int v6 = ~v4 + 1;

		System.out.println(toBinaryString(v4) + "(십진수:" + v4 + ")");
		System.out.println(toBinaryString(v5) + "(십진수:" + v5 + ")");
		System.out.println(toBinaryString(v6) + "(십진수:" + v6 + ")");

	}

	private static String toBinaryString(int value) { // 32비트의 이진 문자열로 리턴하는 메소드
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}

		return str;
	}

}
