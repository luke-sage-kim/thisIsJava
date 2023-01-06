package chap06;

public class Car6 {
//필드

	private int speed;  //접근제한자
	private boolean stop;
	public int gas;
		
	

	// 생성자

	

	// 메소드 
	//Getter 메소드로 필드값을 가공한 후 외부로 전달하는 것
	public int getSpeed() {//스피드를 불러오는거  다른클래스에 getSpeed치면 여기에 저장된 speed를 가져온다
		return speed;
	}
	
	//Setter  매개값을 검증해서 유효한 값만 데이터로 저장
	public void setSpeed(int speed) {  //setSpeed메소드 선언 속도 정수를 받는다
		if(speed < 0) {
			this.speed = 0;
			return;  //단지 이프문처리만할뿐 speed를 가져오는건 위에 get이 함
		}else {
			this.speed = speed;
		}
	}
	//게터
	public boolean isStop() {
		return stop;
	}
	//세터
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
}
