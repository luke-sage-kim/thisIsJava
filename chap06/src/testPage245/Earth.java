package testPage245;
// 상수 선언
//파이널 필드는 객체마다 저장되고 생성자의 매개값을 통해서 여러 가지 값을 가질 수 있기 떄문에 상수가 될 수 없다
public class Earth {
	static final double PI = 3.14159;
	//상수 이름은 모두 대문자로 ㅈ2ㅏㄱ성하는 것이 관례
	static final double EARTH_RADIUS = 6400;
	//서로 혼합된 이름이라면 언더바로 단어들을 연결해준다
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
