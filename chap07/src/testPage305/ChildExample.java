package testPage305;

public class ChildExample {
	public static void main(String[] args) {
		
		Child child = new Child();  // child는 참조변수 객체의 이름입니다~
		Parent parent = child;
		
		parent.method1();
		parent.method2();
	//	parent.method3();// 호출불가능  parent에 없어서
	
	}
}
//