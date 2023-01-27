package testPage474;

import java.util.Comparator;
import java.util.Objects;



//비교자 사용
public class CompareExample {
	//메인 메소드
		public static void main(String[] args) {
			//Student 객체 생성
			Student s1 = new Student(1);
			Student s2 = new Student(1);
			Student s3 = new Student(2);
			
			//s1, s2 객체와 비교 기준이 되는 StudentComparator() 넣어주기
			int result1 = Objects.compare(s1,  s2, new StudentComparator());
			System.out.println("s1과 s2 비교 결과 : " + result1);
			
			int result2 = Objects.compare(s1, s3, new StudentComparator());
			System.out.println("s1과 s3 비교 결과 : " + result2);
		}
		
		//중첩 클래스 (Student) -> 비교자로 쓰일거임!
		//정적(static) 멤버 클래스로 만들기 -> 모든 필드의 초기값이나 모든 메소드에서 객체 생성 가능!
		static class Student{
			//필드
			int sno;
			
			//생성자 (int 타입의 sno을 매개변수로 받음)
			Student(int sno){
				this.sno = sno; //필드명과 매개변수명 동일할경우, this. 키워드 사용
			}
		}
		
		
		//Comparator 인터페이스를 구현한 중첩 클래스 (StudentComparator)
		//정적(static) 멤버 클래스로 만들기 -> 모든 필드의 초기값이나 모든 메소드에서 객체 생성 가능!
		static class StudentComparator implements Comparator<Student> {
			//Comparator 인터페이스가 가지고 있는 추상 메소드를 오버라이딩해서 실체 메소드 작성
			//메소드는 compare() -> Source - Override 메뉴 클릭하면 알 수 있음
			@Override
			public int compare(Student a, Student b) {
				return Integer.compare(a.sno, b.sno); //int 타입을 가지고 비교하고자 할 경우, Integer.compare 사용하면됨
			}
		}



}