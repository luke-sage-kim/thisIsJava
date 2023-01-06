package testPage423;

import java.util.Iterator;

public class ArrayIndexOutOfBoundsExceptio {
	public static void main(String[]args){  //args로 들어오는 배열을 만들것이다
		String data1 = args[0]; //args[0], args[1]의 실행 매개값 주기 않았기 때문에 예외 발생
		String data2 = args[1];
		//if(args.lenghth ==2) {으로 먼저 조건을 걸어 예외를 처리해야 함.
		
		System.out.println("args[0]:" + data1);
		System.out.println("args[1]:" + data2);
		//런 피규레이션으로 두개의 매개값을 입력하면 예외가 발생하지않는다
		
	String[] arr = {"Hello","Good Moring","Good Bye"};
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
	
}
