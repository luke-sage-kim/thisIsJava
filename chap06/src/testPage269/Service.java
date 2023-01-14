package testPage269;
//어노테이션 적용 클래스


public class Service {
	//PrintAnnotation에는 2가지 속성이 있는데 지정을 안해도 되므로 ()가 없다. value에는 "-", number에는 15가 세팅
		@PrintAnnotation
		public void method1() {
			System.out.println("실행 내용1");
		}
		
		//PrintAnnotation에는 2가지 속성이 있는데 출력할 문자열을 지정.number는 15가 세팅
		@PrintAnnotation("*")
		public void method2() {
			System.out.println("실행 내용2");
		}
		
		//PrintAnnotation에는 2가지 속성을 지정함. value에는 "#", number에는 20을 세팅
		@PrintAnnotation(value="#", number = 20)
		public void method3() {
			System.out.println("실행 내용3");
		}
}
