package testPage543;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

//날짜와 시간 객체 생성
public class DateTimeCreateExample {
	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: "+currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);//목표날짜
		System.out.println("목표 날짜: "+targetDate);

		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: "+currTime);

		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간: "+targetTime);

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: "+currDateTime);

		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: "+targetDateTime);

		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: "+utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: "+newyorkDateTime);

		Instant instant = Instant.now();
		Thread.sleep(10);
		Instant instant1 = Instant.now();
		if (instant.isBefore(instant1)) {
			System.out.println("instant 가 빠름");
		} else if (instant.isAfter(instant1)) {
			System.out.println("instant1 이 빠름");
		} else {
			System.out.println("같음");
		}
		System.out.println(instant.until(instant1, ChronoUnit.NANOS));
	}
}
