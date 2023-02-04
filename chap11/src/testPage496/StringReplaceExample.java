package testPage496;
//문자열 대치하기
public class StringReplaceExample {
	public static void main(String[] args) {
		//기존의 문자열인 oldStr
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		
		//새로운 문자열인 newStr
		String newStr = oldStr.replace("자바", "JAVA"); //자바를 JAVA로 변경
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}