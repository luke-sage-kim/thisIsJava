package testPage292;
//자식 객체 이용
public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-12334567", 26);//생성자 호춢

		System.out.println("name : " + student.name ); // 부모에서 물려받은 필드 출력
		
		
		System.out.println("ssn : " + student.ssn );   // 부모에서 물려받은 필드 출력
		
		
		System.out.println("studentNo : " + student.studentNo); // 자식의 필드 출력
	}
}
