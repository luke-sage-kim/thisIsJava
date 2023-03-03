package chap06;

public class SiaLunch {
	public static void main(String[] args) {

		String lunch;
		int num = (int) (Math.random() * 11) + 1;
		switch (num) {
		
		case 1:
			
			lunch = "계란말이김밥";
			break;
		case 2:
			lunch = "돈까쓰김밥";
			break;
		case 3:
			lunch = "참치김밥";
			break;
		case 4:
			lunch = "치즈김밥";
			break;
		case 5:
			lunch = "우엉김밥";
			break;
		case 6:
			lunch = "김치김밥";
			break;
		case 7:
			lunch = "고추김밥";
			break;
		case 8:
			lunch = "피망김밥김밥";
			break;
		case 9:
			lunch = "소고기김밥";
			break;
		case 10:
			lunch = "샐러드김밥";
			break;
		case 11:
			lunch = "새우튀김김밥";
			break;

		default:
			lunch = "야채김밥";
			break;
		}
		System.out.println(lunch);
		
	}
}
