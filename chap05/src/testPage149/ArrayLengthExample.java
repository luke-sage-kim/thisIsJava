package testPage149;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };  //배열 선언
		int sum = 0; //변수선언
		for (int i = 0; i < scores.length; i++) {  //배열길이(전체항목수) 만큼 포문 돌리기
			sum += scores[i];  //배열 전체항목 합치기
		}
		System.out.println("종합 : " + sum);

		double avg = (double) sum / scores.length;   //강제변환  260/3 한거임
		System.out.println("평균 : " + avg);
	}
}
