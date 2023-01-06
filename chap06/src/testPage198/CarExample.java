package testPage198;
//외부 클래스에서 Car필드값 읽기와 변경
public class CarExample {
	public static void main(String[] args) {
		
	
	Car myCar = new Car(); //Car클래스를 읽어온다 그러므로 카클래스르 만들고나서 이걸해야 에러가 뜨지않는다
	
	
	// 필드값 읽기
	System.out.println("제작회사: " + myCar.company);
	System.out.println("모델명: " + myCar.model);
	System.out.println("색깔: " + myCar.color);
	System.out.println("최고속도: " + myCar.maxSpeed);
	//myCar.speed = 10; 마이카 사용해보자 값 집어넣기
	System.out.println("현재속도: " + myCar.speed);

	// 필드값 변경
	myCar.speed = 60;
	System.out.println("변경속도: " + myCar.speed);
}
	
}
