package chap07;

public class arrmoon {
	public static void main(String[] args) {
		String arr[] = { "Hello", "Good", "Moring" };
		for (int i = 0; i < 3; i++)
			System.out.println(arr[i]);
		
		/* 향상된 포문
		String[] arr2 = { "Hello", "Good", "Morning" };
		  for (String string : arr2) { System.out.println(string); }
		 */
	}
}
