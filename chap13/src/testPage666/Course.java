package testPage666;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) { // 생성자
		this.name = name;
		students = (T[]) (new Object[capacity]); // 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고
													// (T[]) (new Object[n])으로 생성해야 한다.
	}												//정해진 타입으로 강제 형변환

	public String getName() {  //이름게또다제~
		return name;
	}

	public T[] getStudents() {  //스튜던트 게또다제~
		return students;
	}

	public void add(T t) { // 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
