package testPage393;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		a.field0 = 1;
		System.out.println(a.field0); //a.으로 해야됨 스태틱(this) 못함
		a.method0();
		
		System.out.println("------------");

		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		System.out.println("------------");
		A.C c = new A.C(); //A클래스 외부에서 정적 멤버 클래스C의 객체를 생성하기위해
		c.field1 = 3; // 인스턴스 필드 사용
		c.method1(); // 인스턴스 메소드 사용.
		A.C.field2 = 3; // 정적 필드 사용.
		A.C.method2();  // 정적 메소드 호출

		System.out.println("------------");
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();//D가져오는거
	}
}
