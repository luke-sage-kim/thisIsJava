package testPage120;

public class BreakExample  {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;   //연산이 오른쪽에서부터 시작하니까 괄호로 매쓰랜덤을 묶어야한다
			System.out.println(num);

			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
