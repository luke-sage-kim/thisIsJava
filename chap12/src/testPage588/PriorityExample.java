package testPage588;

public class PriorityExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {// 스레드 10개 생성
			Thread thread = new CalcThread("thread" + i);

			if (i != 10) { // 10번 스레드가아니면
				thread.setPriority(Thread.MIN_PRIORITY);// 우선순위 1 세팅 ->최하위
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);// 우선순위 10 세팅//10은 우선순위를 가장 높게줌
			}
			thread.start();
		}
	}

}
