package testPage474;
//학생 번호 비교자
import testPage474.CompareExample.Student;

public class StudentComparator implements Comparator<Student> {
	//Comparator 인터페이스가 가지고 있는 추상 메소드를 오버라이딩해서 실체 메소드 작성
	//메소드는 compare() -> Source - Override 메뉴 클릭하면 알 수 있음
	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if (a.sno ==b.sno) return 0;
		else return 1;
	}
}
