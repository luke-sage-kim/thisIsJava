package testPage292;

public class Student extends People {
	public int studentNo;



	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //주석처리시 콘스트럭트 오류생김
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
