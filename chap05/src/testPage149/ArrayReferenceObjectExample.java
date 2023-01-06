package testPage149;
//객체를 참조하는 배열
public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";// 자바라는 글자가 들어간것이다
		strArray[1] = "Java"; // 자바라는 글자가 들어간것이다
		strArray[2] = new String("Java"); // 객체가 들어간것이다

		System.out.println(strArray[0] == strArray[1]);// 주소를 비교
		System.out.println(strArray[0] == strArray[2]); // 서로 다른 객체를 참조하기때문에 false가 나온다
		System.out.println(strArray[0].equals(strArray[2]));// 문자열을 비교하여서 true 가 나온다
	}
}
