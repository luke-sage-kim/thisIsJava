package testPage303B;

import testPage303.A;

public class D extends A {
	public D()  {
		super();
		this.field = "value"; // 자식은 부모 클래스의 protected 접근 제한자에 접근할 수 있다.
		this.method();
	}

	public void method() {
		this.field = "value";
		this.method();
	}
}