package testPage109;
//중첩 if문
public class IfNextedExample {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81; // 주사위 번호 하나 뽑기
		System.out.println("점수:" + score);

		String grade;
		if (score >= 90) {
			if (score >= 95) { // 중첩if문
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) { // 중첩if문
				grade = "B+";
			} else {
				grade = "B";
			}

		}
		System.out.println("학점"+grade);
	}
}
