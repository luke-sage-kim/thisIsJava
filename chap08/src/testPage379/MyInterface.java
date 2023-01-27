package testPage379;


// 기존인터페이스
public interface MyInterface {
	public void method1();
	
	
	//수정후 추가된 메소드
	// 디폴트 메소드
		public default void method2() {
			System.out.println("MyInterface-method2() 실행");
		}
}
