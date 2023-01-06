package testPage243;

public class Singleton {
	private static Singleton singletone = new Singleton();//클래스 내부에서는 new연산자로 생성자 호출이 가능하다

	private Singleton() {   //생성자 
	}

	static Singleton getInstance() {//외부에서 호출가능한 겟인스턴스 선언
		return singletone;
	}
}
