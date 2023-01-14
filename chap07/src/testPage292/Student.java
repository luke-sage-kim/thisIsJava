package testPage292;
//자식 클래스
public class Student extends People {
	public int studentNo;



	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //주석처리시 콘스트럭트 오류생김
		//수퍼는 부모의 기본 생성자를 호출한다
		//수퍼는 반드시 자식 생성자첫줄에 위치해야한다
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
