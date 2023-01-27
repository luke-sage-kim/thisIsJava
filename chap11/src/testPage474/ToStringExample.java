package testPage474;

import java.util.Objects;
//객체 문자 정보
public class ToStringExample {
	public static void main(String[] args) {
		//필드
		String str1 = "홍길동";
		String str2 = null;
		
		//여기서 사용하는 toString()메소드는 Objects의 메소드를 가져다 사용!
		//즉 , 이 ToStringExample 클래스는 Objects를 상속받음
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}


}