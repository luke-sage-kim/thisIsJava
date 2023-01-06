package testPage543;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat format1, format2, format3, format4, format5, format6, format7;
		
		format1 = new SimpleDateFormat("yyyy-MM-dd");//연 월 일
		format2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");//E요일
		format3 = new SimpleDateFormat("yy/MM/dd");
		format4 = new SimpleDateFormat("HH:mm:ss");//s 초
		format5 = new SimpleDateFormat("hh:mm:ss a");//a 오전/오후
		format6 = new SimpleDateFormat("오늘은 yyyy년의 w주차이며 D번째 날입니다.");
		format7 = new SimpleDateFormat("오늘은 M월의 w번째 주, d번째 날이며, F번째 E요일입니다.");
//w년의 몇번째주 W월의 몇번째주
		System.out.println(format1.format(now));
		System.out.println(format2.format(now));
		System.out.println(format3.format(now));
		System.out.println(format4.format(now));
		System.out.println(format5.format(now));
		System.out.println(format6.format(now));
		System.out.println(format7.format(now));
		
	}
}
