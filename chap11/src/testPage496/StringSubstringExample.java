package testPage496;
//문자열 추출하기
public class StringSubstringExample {
	
	public static void main(String[] args) {
		String ssn = "950618-1234567";
		
		String firstNum = ssn.substring(0,6);//0부터 6번째까지
				System.out.println(firstNum);
	
	String secondNum = ssn.substring(7);//7번째부터 쭈우우욱
	System.out.println(secondNum);
	}
}
