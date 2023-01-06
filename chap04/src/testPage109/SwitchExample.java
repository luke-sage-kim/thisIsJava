package testPage109;
//스위치문
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;  // 1부터 6까지  +1부터 123456
		switch(num) {  //변수의 값에 따라서 실행문이 결정된다
		case 1:
			System.out.println("1번이 나왔습니다.");
		break;
		case 2:
			System.out.println("2번이 나왔습니다.");
		break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
				}
	}
}
