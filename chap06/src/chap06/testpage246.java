package chap06;

public class testpage246 {
public static void main(String[] args) {
	Person p1 = new Person("123456-1234567","계백");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	System.out.println(Person.PI);
	System.out.println(Person.EARTH_SURFACE_RADIUS);
	System.out.println(Person.PI* Person.EARTH_SURFACE_RADIUS* Person.EARTH_SURFACE_RADIUS* Person.EARTH_SURFACE_RADIUS);
	/*
	 * p1.nation = "usa"; p1.ssn = "654321-7654321"; p1.name = "을지문덕";
	 * System.out.println(p1.nation); System.out.println(p1.ssn);
	 * System.out.println(p1.name);
	 */
}
}
