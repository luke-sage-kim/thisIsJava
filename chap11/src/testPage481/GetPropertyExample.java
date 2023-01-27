package testPage481;

import java.util.Properties;
import java.util.Set;
//시스템 프로퍼티 읽기
public class GetPropertyExample {
public static void main(String[] args) {
		
		//System.getProperty() 메소드 사용해서
		//운영체제 이름, 사용자 이름, 사용자 홈 디렉토리 읽기
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈 디렉토리 : " + userHome);
		
		//위에 3가지 정보 외 환경설정의 모든 정보를 출력하고 싶을 경우
		System.out.println("-------------------");
		System.out.println("[key value]");
		System.out.println("-------------------");
		
		//모든 속성의 키와 값을 출력하기 위해서 Properties와 Set을 사용
		//출력되는구나 정도만 알고, 자세한 내용은 chap15에서 학습
		Properties props = System.getProperties(); //Properties 타입의 객체 선언
		Set keys = props.keySet(); //Properties가 가지고 있는 keySet() 메소드를 Set의 객체에 대입하기
		for(Object objkey : keys) {
			String key = (String) objkey; //강제변환
			String value = System.getProperty(key); //key이름을 매개값으로 받아, 해당 key에 대한 값을 문자열 value로 리턴
			System.out.println("[ " + key + " ] " + value);
		}
	}


}