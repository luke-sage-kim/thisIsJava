package chap11;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class test01022 {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2023, 1, 23, 00, 00, 00);

		long rs = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		long rm = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		long rh = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		System.out.println(rs);
		System.out.println(rm);
		System.out.println(rh);
	}
}
