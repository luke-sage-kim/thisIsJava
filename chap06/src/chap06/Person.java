package chap06;

public class Person {
	final String nation = "Korea";  //국적 못바꿔!
	final String ssn;
	final String name; //이름 못바꿔!
	static final double PI = 3.14;
	static final double EARTH_SURFACE_RADIUS = 6400;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
