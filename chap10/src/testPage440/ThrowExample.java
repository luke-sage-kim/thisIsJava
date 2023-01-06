package testPage440;

public class ThrowExample {
	public static void main(String[] args) {
		try {
		findClass();
		}
		catch(ClassNotFoundException e ) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		
		
	}
	

	public static void findClass() throws ClassNotFoundException {//호출한 곳에서 예외처리하게 됨
		Class clazz = Class.forName("java.lang.String2");   
}
}