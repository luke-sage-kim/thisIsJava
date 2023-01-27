package testPage496;

//바이트 배열을 문자열로 변환
public class ByteToStringExample {
	public static void main(String[] args) {
		// byte 타입 배열 선언하기
		// 72부터 배열의 인덱스 0번째 (아스키코드로 72가 H, 101이 2 ...등)
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// H e l l o 띄어쓰기 J a v a

		// String 객체 생성시 생성자에 배열 넣기
		String str1 = new String(bytes); // str1 객체에 bytes 배열 처음부터 끝까지 넣기
		String str2 = new String(bytes, 6, 4); // str2 객체에 배열 bytes 배열 6번째인덱스부터 4개 넣기

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

	}

}