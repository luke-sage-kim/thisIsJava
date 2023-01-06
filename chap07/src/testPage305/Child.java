package testPage305;

public class Child extends Parent {
	
	@Override//재정의
	public void method2() {
		System.out.println("자식에 있습니다()");
	}

	
	public void method3() {   //이그잼플에서현재수준에서 접근이 불가능하다
		System.out.println("자식에 있습니다()");
	}}