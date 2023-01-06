package testPage459;

public class Member {
//equals()메소드를 재정의하는 클래스
	
	
	public String id; //객체선언
	public Member(String id) {
		this.id = id;
	}
@Override //equals메소드를 세부적으로 파거나 재정의하는 것인듯
public boolean equals(Object obj) { //동등한지 참거짓 하는 메소드
	if(obj instanceof Member) { //상속관계확인
		Member member = (Member) obj; //멤버에 obj넣어라
		if(id.equals(member.id)) {//
			return true;
		}
	}
	return false;
}

}

