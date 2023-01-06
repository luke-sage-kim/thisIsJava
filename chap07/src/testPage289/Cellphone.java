package testPage289;

public class Cellphone {
	// 필드
		String model;  //모델 객체
		String color;  //컬러객체

		// 생성자

		// 메소드
		void powerOn() { System.out.println("전원을 켭니다."); }
		void powerOff() { System.out.println("전원을 끕니다."); }
		void bell() { System.out.println("벨이 울립니다."); }
		void sendVoice(String message) { System.out.println("자기: " + message); }//전송시 
		void receiveVoice(String message) { System.out.println("상대방: " + message); }//응답시
		void hangUp() { System.out.println("전화를 끊습니다."); }
	}

