package testPage491;

import java.lang.reflect.*;
//동적으로 클래스 멤버정보 얻기

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		//Car 클래스 객체 생성
		Car car = new Car();
		//car 객체로부터 Car 클래스의 객체 얻어내기
		Class clazz = car.getClass();
		
		//Car 클래스의 클래스 이름 정보 불러오기
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		//Car 클래스의 생성자 정보 불러오기 ( getDeclaredConstructors() 사용)
		//생성자 이름, 매개변수 정보를 출력해줌
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();

		//Car 클래스의 필드 정보 불러오기 ( getDeclaredFields() 사용)
		//필드 타입, 필드 이름을 출력해줌
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		//Car 클래스의 메소드 정보 불러오기 ( getDeclaredMethods() 사용)
		//메소드 이름, 매개 변수를 출력해줌
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) { //printParameters 메소드는 Class[] 타입을 받음
		
		//매개 변수 정보를 출력하는 공통 코드
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) { //배열의 크기 -1 보다 i가 작다면,
				System.out.println(","); //콤마(,) 를 찍어라
			}
		}
	}


}