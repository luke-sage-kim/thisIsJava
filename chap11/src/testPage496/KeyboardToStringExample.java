package testPage496;

import java.io.IOException;
// 바이트 배열을 문자열로 변환
public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException { //IOException으로 예외 떠넘기기
		//읽은 바이트를 저장하기 위해 배열 생성.
		byte[] bytes = new byte[100]; //byte 타입의 배열 선언하기
		
		System.out.print("입력 : ");
		
		//console창에 치는 값을 System.in.read() 메소드로 읽고, 그 값을 readByteNo에 저장
		int readByteNo = System.in.read(bytes); // IOException으로 예외 떠넘기지 않으면 컴파일 오류남
		
		//배열의 offset 인덱스 위치부터 length 만큼 String 객체로 생성하기
		//byte[]bytes, int offset, int length
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println("str : " + str);
	}


}