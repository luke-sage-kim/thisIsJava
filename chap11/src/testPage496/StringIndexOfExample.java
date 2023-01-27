package testPage496;
//문자열 포함 여부 조사
public class StringIndexOfExample {
public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
						//01 234567 -> 문자에 띄어쓰기 포함됨
		
		int location = subject.indexOf("프로그래밍"); //프로그래밍이 시작되는 위치
		System.out.println(location); //프로그래밍 문자열 시작 위치가 3이니까 3 출력됨
		
		if(subject.indexOf("자바") != -1) { //자바 문자열의 시작위치가 -1이 아닐 경우.
							//문자열이 포함되어 있지 않을 경우 -1을 리턴하고, 여기선 자바 시작위치인 0을 리턴
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	}


}