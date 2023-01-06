package testPage149;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;// 값의 리스트로 베열 생성
		scores = new int[] { 83, 90, 87 };  //뉴 써서 선언 다시가능
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		//System.out.println(scores);//scores만 하면 유니코드로 출력되서  []이거 붙이던가해야함
		System.out.println("총합 : " + sum1);

		// 리턴된 총합을 sum2에 저장.
		int sum2 = add( new int[] { 83, 90, 87 }); //int[]배열이 선언된 add()메소드가 있을 경우 값 목록으로 배열을 생성함과 동시에 메소드의 매개값으로new써야함
		System.out.println("총합 : " + sum2);
		System.out.println();
	}

	// 총합을 계산해서 리턴하는 메소드  //add메소드
	public static int add(int[] scores) {   
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
