package testPage527;
//자동 박싱과 언박싱
public class AutoBoxingUnBoxingExample {
public static void main(String[] args) {
	//자동 Boxing
	Integer obj = 100; //포장클래스 타입에 기본값이 대입되어서 자동 박싱이된다
	System.out.println("value:"+ obj.intValue());
	
	//대입 시 자동 Unboxing
	int value = obj;
	System.out.println("value:"+ value);
	
	//연산 시 자동 UnBoxing
	int result = obj + 100;
	System.out.println("result:"+result);
}
}
