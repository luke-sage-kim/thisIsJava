package testPage149;
//new 연산자로 배열생성
public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];  //정수    //new 연산자로 배열생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;  //1번쨰 방에 10
		arr1[1] = 20;//2번쨰 방에 20
		arr1[2] = 30;
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println();

		double[] arr2 = new double[3];  //소수
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();

		String[] arr3 = new String[3];   //문자열
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]); //아직 널값
		}
		System.out.println();

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}
