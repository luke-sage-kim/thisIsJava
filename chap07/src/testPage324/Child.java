package testPage324;
//강제 타입변환   부모타입을 자식타입으로 변환하는것
//모든 부모가 자식으로 강제 못하고 자식이 부모로 자동변환후 다시 자식타입으로 변환
public class Child extends Parent {

	public String field2;

	public void method3() {
		System.out.println("Child-method3()");
	}


}