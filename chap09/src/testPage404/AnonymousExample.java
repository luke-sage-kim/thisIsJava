package testPage404;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();//부모클래스(매개값)
		// 익명 객체 필드 사용
		anony.field.wake();//부모의 자식 wake  필드 전체를 사용한다

		// 익명 객체 로컬 변수 사용
		anony.method1();

		// 익명 객체 매개값 사용
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {  //웨이크를 재정의
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
