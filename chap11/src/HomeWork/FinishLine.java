package HomeWork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FinishLine {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2023, 6, 20, 0, 0);
		long rD = ChronoUnit.DAYS.between(startDateTime, endDateTime);
	System.out.println("수료일까지"+rD+"일 남았습니다.");
	}
}
