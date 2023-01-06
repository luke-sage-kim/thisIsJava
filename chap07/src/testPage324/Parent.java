package testPage324;
//강제 타입변환   부모타입을 자식타입으로 변환하는것
//모든 부모가 자식으로 강제 못하고 자식이 부모로 자동변환후 다시 자식타입으로 변환
public class Parent {
	public String field1;  //필드 생성

	public void method1() {
		System.out.println("Parent-method1()");
	}
	public void method2() {
		System.out.println("Parent-method2()");
	}
}
