package testPage511;

import java.util.StringTokenizer;
//StringTokenizer로 토큰 분리하기

public class StringTokenizerExample {
public static void main(String[] args) {
	String text = "BTS/손흥민/봉준호/JayPark";
	
	//how1: 전체 토큰 수를 얻어 for문으로 루핑
	StringTokenizer st = new StringTokenizer(text,"/");//  구분자를가지고 쪼개겠다  /를 찾는  토큰 분리
	int countTokens = st.countTokens();
	for(int i =0; i<countTokens; i++) {
		String token = st.nextToken();
		System.out.println(token);
	}
	System.out.println("Let's Go");
}
}
