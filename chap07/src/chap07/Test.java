package chap07;

public class Test  {
	public static void main(String[] args) {
		//person객체생성
		//setter를 써서 weight를 70으로 입력하고 할당
		//getter를 써서 키를 출력하고, 
		//getter를 써서 weight를 출력합시다
		
//		person.show();
		Person person = new Person("츄",23,161,50);
		person.setWeight(45);
		System.out.println("몸무게"+person.getWeight());
		System.out.println("키"+person.getHeight());
	}
}
