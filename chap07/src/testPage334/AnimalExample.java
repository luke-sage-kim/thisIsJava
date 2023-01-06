package testPage334;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();//dog 객체생성
		Cat cat = new Cat();//cat 객체 생성
		dog.sound();//소리내기
		cat.sound();
		dog.breathe();
		System.out.println("-------------");

		// 변수의 자동 타입 변환
		Animal animal = null;  //부모타입으로 들어가있는다
		animal = new Dog(); // 자동 타입 변환
		animal.sound(); // 재정의된 메소드 호출
		
		animal = new Cat();
		animal.sound(); // 재정의된 메소드 호출
		System.out.println("-------------");

		// 메소드의 다형성
		animalSound(new Dog());//뉴도그가 애니멀의 하위라서 animalSound 
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메소드 호출.
	}
}
