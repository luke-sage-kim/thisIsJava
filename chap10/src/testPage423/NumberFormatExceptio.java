package testPage423;

public class NumberFormatExceptio {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		try {
			String data3 = args[0];
			String data4 = args[1];
			System.out.println("잘됩니다");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러가 발생하였습니다");
		}

		try {

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // 숫자 변환 불가 문자 포함되어 있어 예외 발생

			// System.out.println(data1 + data2);
			System.out.println(value1 + value2);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다");

		} finally { // 이건 트라이든캐치든 무조건 나오는거
			System.out.println("다시 실행하세요");
		}
	}
}
