package chap06;

public class testpage220 {
	public static void main(String[] args) {
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };  //배열 3칸 선언

		int result1 = myCom.sum1(values1);  //values 배열을 사용한다
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 }); //새로운 배열을 만든다
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3);  //values를 사용하지 아니하고 sum2메소드를 사용
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5,6,7,8);
		System.out.println("result4: " + result4);
	}
}
