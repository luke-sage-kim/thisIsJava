package testPage232;
//메소드 오버로딩
public class Calculator {
	// 정사격형의 넓이
		double areaRectangle(double width) {   //넓이값을 더블변수로 받는다
			return width * width;
		}

		// 직사각형의 넓이
		double areaRectangle(double width, double height) {  //메소드 오버로딩  같은 이름의 메소드를 여러 개 선언하는 것
			return width * height;
		}
		int areaRectangle(int width, int height) {  //메소드 오버로딩  같은 이름의 메소드를 여러 개 선언하는 것
			return width * height;
		}
		
		
}
