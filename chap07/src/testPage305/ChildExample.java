package testPage305;
//자동 타입 변환 후의 멤버 접근
public class ChildExample {
	public static void main(String[] args) {
		//생성자
		Child child = new Child();  // child는 참조변수 객체의 이름입니다~
		
		Parent parent = child; //자동 타입 변환
		//부모 타입으로 자동 타입 변환된 이후에는 부모클래스에 선언된 필드와 메소드만 접근이 가능하다
		//비록 변수는 자식 객체르 참조하지만 변수로 접근 가능한 멤버는 부모클래스 멤버로만 한정된다
		
		parent.method1();
		parent.method2();
		//오버라이딩 된 메소드는 타입변환 이후에도 자식 메소드가 호출된다
	//	parent.method3();// 호출불가능  parent에 없어서
	
	}
}
//