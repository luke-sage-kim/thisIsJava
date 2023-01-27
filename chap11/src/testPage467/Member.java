package testPage467;
//복제할 수 있는 클래스 선언
public class Member implements Cloneable { // Cloneable 인터페이스를 구현한 구현 클래스
	// Cloneable 인터페이스의 getMember() 메소드에서 clone()메소드로 자신을 복제할 수 있음
//필드
	public String id; // 아이디
	public String name; // 이름
	public String password; // 비밀번호
	public int age; // 나이
	public boolean adult; // 성인 여부(?)

//생성자 (Source 메뉴안에 있는 단축키로 해도됨)
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

//getMember() 메소드에서 clone()메소드로 자신을 복제하고, 복제한 객체를 외부로 리턴가능
	public Member getMember() {
		Member cloned = null;
//clone()메소드 사용할경우 CloneNotSupportedException예외 발생 가능하므로
//try-catch 이용해서 예외 발생 처리 해주기
		try {
			cloned = (Member) clone(); // clone()메소드 리턴타입이 Object 이므로, Member 타입으로 강제 타입변환 해줌 (Casting)
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned; // 복제한 객체를 리턴하기
	}
}