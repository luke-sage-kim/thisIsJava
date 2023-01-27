package testPage383;
//부모 인터페이스
public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface-method2() call");
	}
}
//디폴트 메소드를 활용하는 방법
//1.단순히 상속만 받는다
//2.디폴트 메소드를 재정의해서 실행 내용을 변경한다
//3.디폴트 메소드를 추상 메소드로 재선언한다.