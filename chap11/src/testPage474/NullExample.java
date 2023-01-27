package testPage474;

import java.util.Objects;
// 널 여부 조사
public class NullExample {
	public static void main(String[] args) {
		//필드 선언
		String str1 = "홍길동";
		String str2 = null; //null값 넣어주기!
		
		//isNull, nonNull 사용하기
	//	System.out.println(Objects.nonNull(str1)); //str1이 not null이므로 true 리턴
	//	System.out.println(Objects.isNull(str2)); //str2가 null이므로 true 리턴
		
		//requireNonNull 사용하기
		System.out.println(Objects.requireNonNull(str1)); //str1이 not null이므로 obj를 리턴 (홍길동 출력)
		System.out.println("-------------");
		
		//requireNonNull() 3가지의 경우를 try-catch문을 사용해서 작성하기
		try {
			String name = Objects.requireNonNull(str2); //str2는 null
		}catch(Exception e) {
			System.out.println(e.getMessage()); //str2가 null이니까 null을 출력
		}
		
		try {	
			String name = Objects.requireNonNull(str2, "이름이 없습니다."); //str2는 null
		}catch(Exception e) {
			System.out.println(e.getMessage()); //str2가 null이니까 이름이 없습니다. 출력
		}

		try {
			String name = Objects.requireNonNull(str2, ()-> "이름이 없다니깐요."); //str2는 null
		}catch(Exception e) {
			System.out.println(e.getMessage()); //str2가 null이니까 이름이 없다니깐요. 출력
		}
	}


}