package testPage496;

//문자열의 문자 수 얻기
public class StringLengthExample {
	public static void main(String[] args) {
		 String ssn = "7306241230123";
		 int length = ssn.length(); //ssn의 문자열 길이 리턴
		 System.out.println("문자열의 길이 : " + length);
		
		 if(length == 13) { //주민번호 자리수인 13자리가 맞다면
			 System.out.println("주민번호 자리수가 맞습니다.");
		 }else { //자리가 13자리가 아니라면
			 System.out.println("주민번호 자리수가 틀립니다.");
		 }
	}


}