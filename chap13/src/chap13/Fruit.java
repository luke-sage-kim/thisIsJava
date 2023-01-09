package chap13;

public class Fruit<T> {
	private T t;

	public T get() {
		return t;//t로 보낸다
	}

	public void set(T t) {
		this.t = t;//t에서 받은거 this로 처리
	}
}