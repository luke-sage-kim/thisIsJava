package testPage86;
//문자열 비교
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);//동일한 객체의 번지값을 가지고있다
		System.out.println(strVar2 == strVar3);//v3가 new string객체의 번지값을가지고있다
		System.out.println();
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar1.equals(strVar3));//고로 이쿠얼스를 써야된다
	}
}
