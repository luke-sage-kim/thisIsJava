package testPage538;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();//현재 운영체제에 설정되어있는 시간대를  기준으로 한 켈린더하위객체를 얻을수있다
	//	System.out.println(now); java.util.GregorianCalendar[time=1672621664934,areField
		
		int year = now.get(Calendar.YEAR); //년도를 리턴
		int month = now.get(Calendar.MONTH) + 1;// 월을 리턴
		int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴

		int week = now.get(Calendar.DAY_OF_WEEK);//요일을 리턴

		String strWeek = null;

		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}

		int amPm = now.get(Calendar.AM_PM);

		String strAmPm = null;

		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);

		int minute = now.get(Calendar.MINUTE);

		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");

	}
}//빅스비 예제만들자 시간묻는거
