package testPage467;
//복제 객체를 변경하더라도 원본 객체는 변함없음
public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성하기 (id, name, password, age, adult순)
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후 패스워드 변경 (Member 클래스의 getMember()메소드 호출하기)
		Member cloned = original.getMember(); //getMember()호출해서 복제하기
		cloned.password = "67890"; //cloned객체의 password값 변경
		
		//복제 객체의 필드값들 출력
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		System.out.println();
		
		//원본 객체의 필드값들 출력
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
	}


}