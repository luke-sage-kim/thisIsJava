package HomeWork;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WhatTime {
public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	System.out.println("빅스비 시간 좀 알려줘");
	
	int h = now.getHour();
	int	m = now.getMinute();
	System.out.println("지금 시간은"+h+"시"+m+"분 입니다.");
	
	System.out.println(now.format(DateTimeFormatter.ofPattern("a HH시 mm분"))+"입니다." );
}	
}
