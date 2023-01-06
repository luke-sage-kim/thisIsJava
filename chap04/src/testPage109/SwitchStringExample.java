package testPage109;
//스트링 타입의 스위치문
public class SwitchStringExample {

	public static void main(String[] args) {
	
	String position = "사장";  //String으로 변수 받기 글자도 가능하다
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:  //기본값 아무것도 아닌것들은 다 300만원
			System.out.println("300만원");
			break;
		}
	}

}
