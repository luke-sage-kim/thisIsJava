package testPage243;
//싱글톤 객체
public class SingletonExample {
	public static void main(String[] args) {

		// Singleton obj1 = new Singleton(); // 컴파일 에러 클래스내부가아니라서
		// Singleton obj2 = new Singleton(); // 컴파일 에러

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
//단 하나의 객체만 만드는 것이기때문에 같은 싱글톤 객체일수밖에 없다
	}
}
