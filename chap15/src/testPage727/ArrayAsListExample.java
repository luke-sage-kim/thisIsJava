package testPage727;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		//String 타입의 객체를 갖는 List 생성하기 (list1)
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		//향상된 for문을 이용해서 list1에 있는 객체들 하나씩 꺼내오기 
		for(String str : list1) {
			System.out.println("이름 : " + str);
		}
		System.out.println();
		
		//Integer 타입의 객체를 갖는 List 생성하기 (list2)
		List<Integer> list2 = Arrays.asList(1,2,3);
		//향상된 for문을 이용해서 list2에 있는 객체들 하나씩 꺼내오기 
		for(Integer value : list2) { //Integer 대신 int 사용해도 됨 
			System.out.println("이름 : " + value);
		}
	}
}
