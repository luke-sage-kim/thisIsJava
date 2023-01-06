package chap06;

public class Messi {
	String player;   
	double speed;		
	
	Messi(String player) {    
		this.player = player; 
	}

	void setSpeed(double speed) { 
		this.speed = speed;  
	}
	
	void run() {
		double i = 32.5;
			this.setSpeed(i);   //setSpeed 메소드 실행
			System.out.println(this.player + "가 시속"+ this.speed +"km/h로 달립니다.");
		}
	
}
