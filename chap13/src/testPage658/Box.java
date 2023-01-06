package testPage658;
// 제네릭 타입
public class Box<T>{
	private T t;//T는 Box클래스로 객체를 생성할 때 구체적인 타입으로 변경된다.
	
	public T get() {return t;}//겟메소드
	
	public void set(T t) {this.t = t;}//셋메소드
//구체적인 타입을 명시하지 않고 타입 파라미터로 대체했다가 실제 클래스가 사용될 때 구체적인 탕비을 지정함으로써 타입 변환을 최소화시킨다
}
