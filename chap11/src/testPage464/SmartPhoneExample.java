package testPage464;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		
		String strObj = myPhone.toString();//toString메소드를 오버라이딩하여 리턴
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
