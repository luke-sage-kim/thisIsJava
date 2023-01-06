package testPage543;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
//날짜와 시간 비교
public class DateTImeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTIme = LocalDateTime.of(2023, 1, 1, 9, 0, 0);//날짜설정
		System.out.println("시작일: " + startDateTIme);

		LocalDateTime endDateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
		System.out.println("종료일:" + endDateTime);

		System.out.println();
		if (startDateTIme.isBefore(endDateTime)) {
			System.out.println("진행 중입니다." + "\n");
		} else if (startDateTIme.isEqual(endDateTime)) {
			System.out.println("종료합니다." + "\n");
		} else if (startDateTIme.isAfter(endDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}
		System.out.println();

		System.out.println("[종료까지 남은 시간]");  //스타트부터 엔드 까지의!
		long remainYear = startDateTIme.until(endDateTime, ChronoUnit.YEARS);// 전체 년 차이
		long remainMonth = startDateTIme.until(endDateTime, ChronoUnit.MONTHS);//전체 달 차이
		long remainDay = startDateTIme.until(endDateTime, ChronoUnit.DAYS);//전체 일 차이
		long remainHour = startDateTIme.until(endDateTime, ChronoUnit.HOURS);//전체 시간차이
		long remainMinute = startDateTIme.until(endDateTime, ChronoUnit.MINUTES); //전체 분차이
		long remainSecond = startDateTIme.until(endDateTime, ChronoUnit.SECONDS);

		remainYear = ChronoUnit.YEARS.between(startDateTIme, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTIme, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTIme, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTIme, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTIme, endDateTime);

		System.out.println("남은 해:" + remainYear);
		System.out.println("남은 달:" + remainMonth);
		System.out.println("남은 일:" + remainDay);
		System.out.println("남은 시간:" + remainHour);
		System.out.println("남은 분:" + remainMinute);
		System.out.println("남은 초:" + remainSecond);

		System.out.println();
		System.out.println("[종료까지 남은 기간]"); //메소드
		Period period = Period.between(startDateTIme.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간: "+period.getYears()+"년 ");
		System.out.print(period.getMonths()+"달 ");
		System.out.print(period.getDays()+"일\n");
		
		System.out.println();
		Duration duration = Duration.between(startDateTIme.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초:"+duration.getSeconds());
		/*
		 * LocalDateTime xmas = LocalDateTime.of(now.getYear(), 12, 25, 0, 0, 0);
		 * System.out.println(ChronoUnit.DAYS.between(now, xmas));
		 */
	}
}
