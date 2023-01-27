package testPage481;


//자바홈 환경변수값얻기
public class SystemEnvExample {
	public static void main(String[] args) {
		//JAVA_HOME
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javahome);
		
		//path
		String path = System.getenv("path");
		System.out.println("path : " + path);
		
		//CLASSPATH
		String classpath = System.getenv("CLASSPATH");
		System.out.println("CLASSPATH : " + classpath);
	}


}