package testPage669;

public interface Storage<T> {
	//자식 구현 클래스가 반드시 구현(오버라이딩)해야 할 "강제 규칙"
	public abstract void add(T item, int index); 	//add 함수의 매개변수
	
	public abstract T get(int index);//get 메소드의 return 타입
	
}


