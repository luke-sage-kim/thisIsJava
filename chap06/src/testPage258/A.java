package testPage258;
//생성자의 접근제한
public class A {
	//필드

	 A a1 = new A(true);

	 A a2 = new A(1);

	 A a3 = new A("문자열");



	 //생성자 

	 public A(boolean b) {}

	 A(int b) {}    //디폴트 접근제한 같은 패키지에서는 제한없이 호출 가능

	 private A(String s) {} 
}
