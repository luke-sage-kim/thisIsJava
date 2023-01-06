package testPage193;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();  
		//같은 디렉토리에 있어서 다른 클래스에서 찾아오는듯?
		//new는 클래스로부터 객체를 생성시키는 연산자  우항에 Student는 생성자로 생성자는 class()형태가짐
		//힙영역에 객체 생성시킨후 객체의 주소를 리턴하도록 되어있다.-> 클릭하면 Student로 보내짐
		System.out.println(s1.number);
		System.out.println(s1.school);
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();  //객체가 만들어진것이다
		System.out.println(s1.number);
		System.out.println(s1.school);
		System.out.println("s2 변수가 또 Student 객체를 참조합니다.");
		//s1 s2는 완전히 독립된 서로 다른 객체이다
	//	Student h1 = new Student();
	//	System.out.println(h1.number); //이 1이 되도록 새로운 클래스를 만들어주세요.
		//Math.random()
		
	}
}





