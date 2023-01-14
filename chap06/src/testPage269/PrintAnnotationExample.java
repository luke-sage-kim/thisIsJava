package testPage269;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service 클래스로부터 메소드 정보를 얻음
		// Service 안에 있는 메소드들을 가져오기
		
		Method[] declareMethods = Service.class.getDeclaredMethods();
	//	System.out.println(Service.class);
	//	System.out.println(declareMethods);
		
		
		// Method 객체를 하나씩 처리
		//모든 데이터(메소드들)에 대한 처리 -> 3개의 메서드를 차례로 실행한다.
		for (Method method : declareMethods) {
			// PrintAnnotation이 적용되었는지 확인
			// 실행할 메소드 타입 -PrintAnnotation 어노테이션이 선언되어진 타입의 메소드만
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				//Annotation 관련 실행 처리 -----------------------------
				//맞으면 실행문들을 작성
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
		//		System.out.println("value = " + printAnnotation.value());
		//		System.out.println("number = " + printAnnotation.number());
				//구분선 출력
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//Annotation 이 적용된 메소드를 실행한다. --------------------
				try {
					//메소드 호출
					//Service 객체 안에서 매칭되는 메소드를 실행한다.
					method.invoke(new Service());
				} catch (Exception e) {}
				// TODO Auto-generated catch block
				System.out.println("오류 발생");
			}
		}
	}


}
