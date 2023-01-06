package testPage171;

import java.util.Calendar;

public class EnumweekExample {
	public static void main(String[] args) {
		Week today = null;
		//week(int타입)에 따라 today(7개만 넣을 수 있는 week 타입)
		//오늘 날짜를 객체로 받고 요일을 가져온다. 1~7
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {//7개만 넣을수있다
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			System.out.println("잘못된 요일 정보 입니다.");
		}
		
		System.out.println("오늘 요일: "+ today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 유산소를 합니다.");
			}
		if(today == Week.MONDAY) {
			System.out.println("월요일에는 광배근 삼각근을 합니다.");
		}
		if(today == Week.TUESDAY) {
			System.out.println("화요일에는 대흉근 이두근 삼두근을 합니다.");
		}
		if(today == Week.WEDNESDAY) {
			System.out.println("수요일에는 대퇴사두근 중둔근 이상근을 합니다.");
		}
		
		else
		{System.out.println("열심히 자바 공부합니다.");
		}
	}



}
