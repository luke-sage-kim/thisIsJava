package chap02;

public class testpage54 {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //인트에서 캐릭으로 강제변환
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;  //롱에서 인트로 강제변환
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;  //더블에서 인트로 바뀔시 소숫점 사라짐
		System.out.println(intValue);
	}
}
