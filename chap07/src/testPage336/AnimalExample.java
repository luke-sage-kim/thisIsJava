package testPage336;

import testPage334.Animal;
import testPage334.Cat;
import testPage334.Dog;

public class AnimalExample {
	public static void main(String[] args) {
		
		//일반적인 방식으로 도그와 캣 변수로 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
			
		animal = new Cat();
		animal.sound();
		System.out.println("-------------------");
		//메소드의 다형성
		
		//부모타입의 매개 변수에 자식 객체를 대입해서메소드의 다형성을 적용
		animalSound(new Dog());
		animalSound(new Cat());
				
}
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
}
