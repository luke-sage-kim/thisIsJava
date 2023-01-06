package testPage563;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//포맷팅 문자열
public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();//현재시간 가져오기
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		//포멧을 만든다
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
