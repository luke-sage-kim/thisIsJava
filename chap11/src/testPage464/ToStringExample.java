package testPage464;
//객체 문자 정보
import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();//시스템의 날짜와 시간 정보를 리턴한다
		System.out.println(obj1.toString());//객체를 문자열로 표현한값
		System.out.println(obj2.toString());
	}
	
}
