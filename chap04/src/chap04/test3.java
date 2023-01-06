package chap04;

public class test3 {

	public static void main(String[] args) {
		
	int score = (int) (Math.random()*50+1);
	
	if (score  <=10) {
		System.out.println("1등급입니다");
		
	}else if (score <=20) {
		System.out.println("2등급입니다");
	}else if (score <=30) {
		System.out.println("3등급입니다");
	}else if (score <=40) {
		System.out.println("4등급입니다");
	}else {
		System.out.println("5등급입니다.");
	}
	}	
}
