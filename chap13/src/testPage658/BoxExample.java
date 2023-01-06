package testPage658;
//제네릭 타입 이용
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();//T는 스티링탕비으로 변경되어 내부적으로 자동으로 재구성
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}
}
