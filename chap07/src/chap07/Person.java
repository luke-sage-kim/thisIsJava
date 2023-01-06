package chap07;

public class Person {
	private String name;

	private int age;
	private int height;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//생성자를 만들어 주세요.

	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//Person 객체를 생성합니다
	
	
	//show () 이름 나이 키 몸무게를 출력하는 메소드
	
	public void show () {
		System.out.println("이름"+this.name);
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.weight);
	}
	
	
	
}
