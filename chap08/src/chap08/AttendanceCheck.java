package chap08;

import java.util.Scanner;

public class AttendanceCheck {
	public static void main(String[] args) {

		System.out.println("중앙정보처리학원에 오신것을 환영합니다.");
		System.out.println("출석체크 방식을 선택해주세요");
		System.out.println("1번 지문인식 2번 비콘사용");
		Scanner superscan = new Scanner(System.in);
		int q = superscan.nextInt();
		if (q == 1) {
			Attendance ac = new fingerprintRecognition();

			ac.finger();
			ac.turnOn();
		} else {
			Attendance ac = new beaconRecognition();

			ac.turnOn();
			ac.finger();
			ac.turnOff();
		}
	}
}
