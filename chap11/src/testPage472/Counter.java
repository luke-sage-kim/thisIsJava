package testPage472;

// finalize() 메소드 재정의
public class Counter {
	//필드
		private int no; //번호
		
		//생성자
		public Counter(int no) {
			this.no = no;
		}
		
		//메소드
		//Object의 추상 메소드인 finalize()를 오버라이딩해서 실체 메소드 작성하기
		@Override
		public void finalize() throws Throwable{
			System.out.println(no + "번 객체의 finalize()가 실행됨");
		}


}