package testPage664;
//제네릭메소드
public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // Number의 doubleValue() 메소드 사용
		double v2 = t2.doubleValue(); // Number의 doubleValue() 메소드 사용
		return Double.compare(v1, v2);
	}
}
//더블밸류 메소드는 넘버클래스에 정의되어있는 메소드로  숫자를 더블타입으로 변환한다