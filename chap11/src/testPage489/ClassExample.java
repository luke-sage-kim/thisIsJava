package testPage489;
//getClass와 forName()예제

public class ClassExample {
	public static void main(String[] args) {
		// 일단 Car 객체 생성
		Car car = new Car();
		
		//객체로부터 Car 클래스 객체 얻어내기
		Class clazz1 = car.getClass();
		
		//getName(), getSimpleName(), getPackage().getName()메소드 이용해서
		System.out.println("[객체로부터 얻은 클래스의 정보]");
		System.out.println("클래스 이름 : " + clazz1.getName()); //클래스의 이름 (패키지 경로부터 클래스 이름까지 쭉)
		System.out.println("클래스의 단순 이름 : " + clazz1.getSimpleName()); //단순히 진짜 클래스의 이름만
		System.out.println("클래스가 들어있는 패키지 이름 : " + clazz1.getPackageName()); //클래스가 들어있는 패키지 이름만
		System.out.println();
		
		//문자열로부터 Car 클래스 객체 얻어내기 (try-catch문 사용)
		//이 경우에는, 직접 클래스의 경로를 기입해야함
		try {
			Class clazz2 = Class.forName("testPage489.Car");
			System.out.println("[문자열로부터 얻은 클래스의 정보]");
			System.out.println("클래스 이름 : " + clazz2.getName());
			System.out.println("클래스의 단순 이름 : " + clazz2.getSimpleName());
			System.out.println("클래스가 들어있는 패키지 이름 (getPackage().getName() 사용) : " + clazz2.getPackage().getName());
			System.out.println("클래스가 들어있는 패키지 이름 (getPackageName() 사용) : " + clazz2.getPackageName()); //윗줄 코드랑 출력은 같음
			System.out.println("패키지 전체 이름 : " + clazz2.getPackage());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}