package testPage472;
//finalize () 메소드 실행 확인
public class FinalizeExample {
	public static void main(String[] args) {
		//Counter 객체 생성
		Counter counter = null;
		
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null; //Counter 객체를 쓰레기로 만들기
			System.gc(); //쓰레기 수집기 실행 요청하기
						 //gc()가 finalize()를 호출하기 때문에, 예외 처리 안해줘도 됨!
						 //직접 finalize()메소드를 호출할 경우에는 예외 처리 해줘야함
		}
	}

}