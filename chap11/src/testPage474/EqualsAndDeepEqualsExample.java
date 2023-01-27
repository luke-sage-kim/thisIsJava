package testPage474;

import java.util.Arrays;
import java.util.Objects;

//객체 동등비교
public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		//래퍼클래스 Integer 클래스를 가져다 쓰기 위해 객체 생성 (숫자값)
		//래퍼클래스 Integer == int의 래퍼클래스
		//여기서 Integer 사용하는 이유? null 값으로 초기화 가능해서!!! (int는 null로 초기화 불가)
		Integer o1 = 1000; // Integer o1 = new Integer(1000);이랑 같음
		Integer o2 = 1000;
		
		//o1, o2 얕은 비교하기 (Objects 클래스의 equals() 사용)
		//-> 두 값이 동일하면 true, 둘중하나 null이면 false, 둘다 null이면 true
		System.out.println(Objects.equals(o1, o2)); //o1이랑 o2 비교
		System.out.println(Objects.equals(o1, null)); //o1이랑 null비교
		System.out.println(Objects.equals(null, o2)); //o2랑 null비교
		System.out.println(Objects.equals(null, null)); //null이랑 null비교

		
		System.out.println("-------");
		
		//o1, o2 깊은 비교하기 (Objects 클래스의 deepEquals() 사용)
		//-> 마찬가지로 두 값이 동일해야 true
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println(Objects.deepEquals(o1, null));
		System.out.println(Objects.deepEquals(null, o2));
		System.out.println(Objects.deepEquals(null, null));
		System.out.println("-------");
		
		//이번에는 배열 사용해서 객체 생성
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		
		//arr1, arr2 얕은 비교, 깊은 비교하기 (Objects의 equals() 사용)
		System.out.println(Objects.equals(arr1, arr2)); //두 배열이 동등한지 비교하는거니까, false. 다른 객체이므로!
		System.out.println(Objects.deepEquals(arr1, arr2)); //두 배열의 값까지 비교하는 깊은 비교니까, true
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
		System.out.println("-------");
		
		//arr1, arr2 얕은 비교, 깊은 비교하기 (Arrays의 equals() 사용)
		System.out.println(Arrays.equals(arr1,arr2)); //Arrays 클래스의 equals() 사용하면 얕은 비교시 true
		System.out.println(Arrays.deepEquals(arr1, arr2)); //Arrays 클래스의 deepEquals() 사용하면 깊은 비교시 true
	}

}