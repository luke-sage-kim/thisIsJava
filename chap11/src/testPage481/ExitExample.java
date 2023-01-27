package testPage481;
//exit 메소드
public class ExitExample {
public static void main(String[] args) {

		//보안 관리자 설정
		//securityManager로 5를 넣어줄 경우, 즉 종료 상태값이 5일 경우 프로세스가 종료됨
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status != 5) { //종료 상태값이 5가 아닐경우
					throw new SecurityException(); //throw : 강제적으로 예외 발생시키는 키워드
				}
			}
		});
		
		for(int i=0; i<10; i++) { //i=0부터 9까지 10번 반복하지만, i가 5가되면 System.exit(5)가 되어 JVM을 종료함
			//i값 출력
			System.out.println(i);
			try {
				//JVM 종료 요청
				System.exit(i); //System.exit()가 실행되면, 보안관리자의 checkExit()메소드가 자동 호출됨
			} catch(SecurityException e) { } //종료 상태값을 조사해 특정값이 입력되지 않으면, 예외가 발생함
		}
	}

}
