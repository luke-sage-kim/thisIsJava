package testPage393;

public class A {
	// 필드
	int field0;
	// 생성자

	// 바깥클래스

	A() {
		System.out.println("A 객체가 생성됨");

		// A class 내에서 B 객체 접근.
		
		//B b = new B(); // A클래스 외부에서 인스턴스 멤버클래스B객체 생성
		// b.field1 = 3;
		// b.method1();
	};
	
	//method 메소드
	void method0() {
		System.out.println("field0:"+field0);
	}

	/** 인스턴스 멤버 클래스 **/
	class B {
		// 필드
		
		int field1;
		// static int field2; // (X) 컴파일 오류 - static 필드 생성할 수 없음

		// 생성자
		B() {System.out.println("B 객체가 생성됨");}

		// 메소드
		void method1() {System.out.println("B 객체의 method1() 호출");}
		// static void method2() { } // (X) 컴파일 오류 - static 메소드는 생성할 수 없음
	}

	/** 정적 멤버 클래스 **/  //스태틱으로 선언된 클래스를 말한다 모든 종류의 필드와 메소드 선언가능
	static class C {
		
	//	void method() {
	//		field1 = 10; //인스턴스 필드와 메소드는 접근할 수 없다
	//		method1();}
		
		int field1;
		static int field2;

		// 생성자
		C() {
			System.out.println("C 객체가 생성됨");
		}
		
		
		// 메소드
		void method1() {
			System.out.println("C 객체의 method1() 호출");
		
		}

		static void method2() {
			System.out.println("C 객체의 method2() 호출");
		}
	}

	void method() {  //중첩클래스는 메소드내에서도 선언가능하다 이게 바로 로컬 클래스
		/** 로컬 클래스 **/
		class D {
			int field1;

			// static int field2;  정적필드 사용 불가
			D() {
				System.out.println("D 객체가 생성됨");
			}

			void method1() {
				System.out.println("D 객체의 method1() 호출");
			}
			// static void method2() { } 정적 메소드 사용불가
		}
		
		// 로컬클래스 사용 방법.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
