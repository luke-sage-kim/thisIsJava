package testPage660;

public class Util {
	public static <T> Box<T> boxing(T t) {//<>기호안에 타입 파라미터T를 기술한뒤 매개변수탕비으로 T를 사용
		//리턴타입으로 Box <T>를 사용했다
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
