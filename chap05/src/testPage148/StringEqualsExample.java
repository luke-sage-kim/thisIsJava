package testPage148;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "나무";
		String strVar2 = "나무";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		System.out.println(strVar1 + "/" + strVar2);
		System.out.println(strVar1.hashCode() + "/" + strVar2.hashCode());
		System.out.println(System.identityHashCode(strVar1) + "/" + System.identityHashCode(strVar2));
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("나무");
		String strVar4 = new String("나무");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		System.out.println(strVar3 + "/" + strVar4);
		System.out.println(strVar3.hashCode() + "/" + strVar4.hashCode());
		System.out.println(System.identityHashCode(strVar3) + "/" + System.identityHashCode(strVar4));
		//문자열인 경우 데이터가 같더라도 ==로 비교하지 않는다. equals()를 사용한다.
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		if(strVar1 == strVar3) {
			System.out.println("strVar1과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar3는 참조가 다름");
		}


	}
}
