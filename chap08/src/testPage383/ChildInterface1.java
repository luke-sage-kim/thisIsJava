package testPage383;
//자식 인터페이스
public interface ChildInterface1 extends ParentInterface{
	public void method3();
}
// 이경우 메소드 1과 메소드 3의 실체메소드를 가지고있어야하며
//메소드 2를 호출 할 수 있다