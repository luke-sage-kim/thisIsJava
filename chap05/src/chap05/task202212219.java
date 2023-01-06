package chap05;

public class task202212219 {

	public static void main(String[] args) {
		String[] oldIntArray = { "사과", "딸기", "포도" }; //
		String[] newIntArray = new String[5];
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		newIntArray[2] = null;
		newIntArray[4] = "망고";
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
