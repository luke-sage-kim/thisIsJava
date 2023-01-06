package testPage86;
//문자열 연결 연산자
public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;  //+연산자는 산술연산자 부호뿐만아니라 문자열 연결 연산자
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //괄호를 않넣어서 33.0이 됨
		String str4 = 3 + 3.0 + "JDK"; //왼쪽이 먼저 계산되므로 6.0이됨
		System.out.println(str3);
		System.out.println(str4);
	}
}
