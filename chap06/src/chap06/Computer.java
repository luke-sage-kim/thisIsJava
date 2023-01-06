package chap06;

public class Computer {
	int sum1(int[] values) {  //선언된 배열 값을 가져온다
		int sum = 0;
		for(int i=0; i < values.length; i++) { //배열에 있는 값을 더하자
			sum += values[i];
		}
		return sum;
	}

	int sum2(int...values) {    //매개변수의 개수를 알 수 없는경우 사용   메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값 사용
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
