package testPage240;

//정적 블록은 클래스가 메모리로 로딩될 떄 자동적으로 실행됨
//클래스가 메모리로 로딩될 때 선언된 순서대로 실행된다

public class Television {
	static String company = "Samsung"; //초기값주어짐
	static String model ="LCD"; //초기값주어짐
	static String info; //초기값이없음

	//정적필드  //필드란 클래스를 구성하는 요소 중 하나로 클래스 내부 멤버
	//어떠한 데이터를 저장하기 위한 역할을 담당하며 클래스 내부의 생성자와 메소드 밖에 정의가 된다
	static {
		info = company + "-" + model;
	}//인포필드는 정적블록에서 컴파니와 모델필드값을 서로 연결해서 초기값으로 설정
}
