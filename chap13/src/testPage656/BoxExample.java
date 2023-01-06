package testPage656;
//비제네릭 타입이용
public class BoxExample {
public static void main(String[] args) {
	Box box = new Box();
	box.set("홍길등");				//String -> Object (자동타입 변환)
	System.out.println(box.get());
	
	String name = (String)box.get(); //Object ->String  (강제자동타입 변환)
	System.out.println(name);
	
	box.set(new Apple());  //Apple -> Object (자동타입 변환)
	
	System.out.println(box);
	
	Apple apple = (Apple)box.get();// Object ->Apple  (강제자동타입 변환)
	System.out.println(apple);
}
}
