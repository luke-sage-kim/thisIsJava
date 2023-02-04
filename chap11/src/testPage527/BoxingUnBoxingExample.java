package testPage527;
//기본 타입의 값을 박싱하고 언박싱하기
public class BoxingUnBoxingExample {
public static void main(String[] args) {
	//포장클래스는 기본타입의 첫 문자를 대문자로 바꾼 이름을 가진다
	//Boxing
	Integer obj1 = new Integer(100);   //기본 타입의 값을 줄경우
	Integer obj2 = new Integer("200"); //문자열을 준경우
	Integer obj3 = Integer.valueOf("300");//정적 밸류오브메소드
	//기본 타입의 값을 갖는 객체  외부에서 변경할수없다
	
	//Unboxing
	int value1  = obj1.intValue();
	int value2  = obj2.intValue();
	
	int value3  = obj3.intValue();

	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
}
}
