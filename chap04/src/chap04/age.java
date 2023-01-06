package chap04;

public class age {

	public static void main(String[] args) {
		int age = 45;
		
		if(age<=15) {
			System.out.println("어린이입니다");
		}

		
		else if(age<=25) {
			System.out.println("청소년입니다");
		}
		else if(age<=35) {
			System.out.println("청년입니다");
		}
		else if (age<=55) {
			System.out.println("중년입니다");
		}
		else if (age<=65) {
			System.out.println("중년입니다");
		}
		else   {
			System.out.println("노년입니다");
		}

		
		
	}

}
