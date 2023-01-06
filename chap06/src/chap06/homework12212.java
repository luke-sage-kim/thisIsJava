package chap06;

public class homework12212 {
	public static void main(String[] args) {

		String lunch;
		int num = (int) (Math.random() * 3) + 1;
		if (num == 1) {
			lunch = "햄버거";
			System.out.println(lunch);//
		} else if (num == 2) {
			lunch = "중식";
			System.out.println(lunch);//
		} else {
			lunch = "일식";
			System.out.println(lunch);//
		}
	}
}
