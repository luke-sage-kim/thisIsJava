package testPage327;
// 객체 타입 확인
public class InstanceofExample {
	public static void method1(Parent parent) {
		
		
		if(parent instanceof Child) { // Child 타입으로 변환이 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		//	child.method3(); // 변환 후 자식 클래스에만 있는 메소드를 사용할 수 있다.
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // ClassCastException이 발생할 가능성이 있음.
		System.out.println("method1 - Child로 변환 성공");
	}//인스턴스 오브 연산자로 변환 시킬 타입의 객체인지 조사해서 잘못된 매개값으로 인해 프로그램이 종료되는것을
	//막아야한다

	public static void main(String[] args) {
		Parent parentA = new Child(); 
		method1(parentA); // Child 객체를 매개값으로 전달
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB); // Parent 객체를 매개값으로 전달.
		method2(parentB);
	}

}
