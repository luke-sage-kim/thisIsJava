package testPage269;
//어노테이션 정의


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//작성되는 있는 PrintAnnotation은 메소드에 적용되는 것이다.
	@Target({ElementType.METHOD})   //메소드에만 적용하도록
	//실행할 때 유지시켜준다.
	
	@Retention(RetentionPolicy.RUNTIME)//런타임 시까지 어노테이션 정보를 유지하도록

	//inter : 사이, face: 얼굴 -> interface 얼굴과 얼굴 사이 -> 대화하기 위한 동구.
	//interface + 메타데이터 -> 어노테이션 -> 타입 사용가능
	
	
	
	public @interface PrintAnnotation {
		//value 라는 속성으로 값을 넣어야 한다. 넣지 않으면 "-"가 된다. : 출력할 문자열 정의
		//발류는 구분선에 사용될 문자
		String value() default "-";
		//number 라는 속성으로 값을 넣어야 한다. 넣지 않으면 15가 된다. : 출력할 문자열 반복 출력하는 횟수
		int number() default 15;}//반복 출력 횟수



