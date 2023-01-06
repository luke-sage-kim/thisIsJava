package testPage527;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		
	
	int value1 = Integer.parseInt("10"); //참조형을 기본형으로 변환
	double value2 = Double.parseDouble("3.14"); //3.14 <-"3.14" 
	boolean value3 = Boolean.parseBoolean("true");
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);


}
}
