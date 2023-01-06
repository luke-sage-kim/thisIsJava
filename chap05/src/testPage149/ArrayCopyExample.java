package testPage149;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" }; // 행완성
		String[] newStrArray = new String[5]; // 새로운 행 5칸짜리

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); // old에서 0개를 new에서 0개로 옮겨라
		// newStrArray[3] = "아";// 4번째칸은 3이다 왜냐 0시작해서 0 1 2 3 45
		// newStrArray[4] = "시발";
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
	}
}
