package testPage423;

public class ClassCastExceptio {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
		//if (animal instanceof Dog) {
			Dog dog = (Dog) animal; //ClassCastException 발생 가능 강제 타입변환이라서
		//}
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
