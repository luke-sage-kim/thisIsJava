package testPage120;
//키보드로 와일 제어
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;  //불린에 트루라 주고가겠다.
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10)  // Enter 키가 입력되면 캐리지리턴(13), 라인피드(10)가 입력되므로 이 값을 제외  != ~이 아니라면
				//아스키코드         
				System.out.println("-------------------------------");
				System.out.println(" 1.종속 | 2.감속 | 3.중지"); // 메뉴 생성
				System.out.println("-------------------------------");
				System.out.print("선택: ");
			
			keyCode = System.in.read(); // 키보드의 키 코드를 읽음  키코드: 키보드에 뭐가 눌러졌는지!
		
			if(keyCode == 49) { // 1(아스키코드)을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			}  else if(keyCode == 50) { // 2을 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 51) { // 3을 읽었을 경우
				run = false; //  while 문을 종료하기 위해 run 변수에 false를 저장
			}
			
			
			
				
		}
		System.out.println("프로그램 종료");
	}
	
}