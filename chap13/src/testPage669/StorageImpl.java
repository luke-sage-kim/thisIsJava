package testPage669;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public StorageImpl (int capacity) {//타입파라미터로 배열을 생성하려면 newT[n]형태로 생성할 수 없고 (T[])(new Object[n])으로 생성해야한다
		this.array = (T[])(new Object[capacity]);// Object 최상위 클래스 생성자를 부른다
	}//constructor

	public void add(T item, int index) {
		array[index] = item;
	} //add

	public T get(int index) {
		return array[index];
	} //get  T타입 리턴


}
