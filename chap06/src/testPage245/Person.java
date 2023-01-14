package testPage245;

//final 필드 선언과 초기화
public class Person {
	final String nation = "Korea";  //국적 못바꿔!
	final String ssn;
	final String name; //이름 못바꿔!
	

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
