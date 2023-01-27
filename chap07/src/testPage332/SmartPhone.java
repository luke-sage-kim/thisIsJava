package testPage332;

public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone(String owner) {  //필드가 없음에도 불구하고 상속을 받아서 바로 변수받음
		super(owner);//폰에있는거
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
