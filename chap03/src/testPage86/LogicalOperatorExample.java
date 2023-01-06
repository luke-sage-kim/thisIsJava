package testPage86;
//논리연산자
public class LogicalOperatorExample  {

	public static void main(String[] args) {
		int charCode = 'A'; //사용자로부터 받는 문자열  한글은 안됨
		if ((charCode >= 65) & (charCode <= 90) ) { //두개다 조건 평가
			System.out.println("대문자 이군요");
		}
		if ((charCode >= 97) && (charCode <= 122) ) { //앞에꺼 팔스면 뒤에꺼도 팔스
			System.out.println("소문자 이군요");
		}

		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0-9 숫자 이군요");
		}

		int value = 5;

		if ((value %2 == 0) | (value %3 == 0) ) {//두개다 조건 평가
			System.out.println("2 또는 3의 배수 이군요.");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {  //앞에꺼 트루면 뒤에꺼도 트루
			System.out.println("2 또는 3의 배수 이군요.");
	}

	}
	}
