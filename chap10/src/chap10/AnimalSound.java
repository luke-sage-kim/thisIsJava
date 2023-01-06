package chap10;

public class AnimalSound {

	private static void Sound(Crying crying) {
		System.out.println(crying.cry());
	}
	

public static void main(String[] args) {
	Sound(new Dog());
	Sound(new Cat());
	
}
}