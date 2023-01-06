package testPage149;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };   //배열 완성   이 인티져들~~~ 
		//scores = {1,2,3}; //컴파일 에러: 배열 변수를  이미 선언한후에 다른 실행문에서 중괄호를 사용한 배열 생성은 허용되지 않는다.
		//scores = new int[] {1,2,3};   //하지만 다음과 같이 new 연산자를 사용해서 값 목록을 지정해주는것은 가능
		
		// scores [ 0] = 12;//값 수정하기
		System.out.println("scores[0] : " + scores[0]);  //인덱스번호0번
		System.out.println("scores[1] : " + scores[1]);  //인덱스,번호1번
		System.out.println("scores[2] : " + scores[2]);
	//	System.out.println(scores.length); 길이 나타내기

		int sum = 0;  //sum 이란 객체 생성
		for (int i=0; i<3; i++) { //i 0부터 2까지 돌린다
			sum += scores[i];     //인덱스로 접근하는방법  : 대괄호를 해준다
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	
	}
/*
 * 타입[] = { 값0, 값1, 값2, 값3, ... };
 * 
 * 타입[] = 변수
 * 변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
 */
}
