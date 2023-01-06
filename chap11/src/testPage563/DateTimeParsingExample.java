package testPage563;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//문자열 파싱
public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");//문자열 파싱
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;//패턴 정의  기본적으로 이 포멧터 사용해서 파싱
		localDate = LocalDate.parse("2024-05-21", formatter);//패턴에 해당하는 문자열을 LoacalDate 객체로 변환
		System.out.println(localDate);		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");//또 다른 포멧터
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);		
	}
}
