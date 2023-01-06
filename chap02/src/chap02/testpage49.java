package chap02;

public class testpage49 {
	public static void main(String[] args) {
		boolean stop = false; //false도 넣어봐
		if (stop) {  //2가지 상태값 저장 필요에따라 실행흐름 변경하는데 사용
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
