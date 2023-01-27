package testPage491;

public class Car {
	//필드
	private String model;
	public String owner;
	
	//생성자 (기본 생성자 1개, 추가 생성자 1개)
	public Car() { //기본 생성자	
	}
	public Car(String model) { //String타입 매개변수 1개 받는 추가 생성자
		this.model = model;
	}
	
	//메소드 (Getter, Setter 메소드)  
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	private void setOwner(String owner) {
		this.owner = owner;
	}


}
