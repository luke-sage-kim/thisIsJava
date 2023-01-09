package testPage727;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//먼저, List 객체를 생성해주기. 
		List<String> list = new ArrayList<String>();
		
		//list에 String 타입의 객체 5개 저장해주기. add()메소드 사용
        //list.add(new String("가")); -> 이렇게 넣어도되고, 아래처럼 해도됨. String객체는 Integer와 다르게, 그냥 "가"로 넣어도됨 
		list.add("가"); //인덱스 0에 "가" 넣기
		list.add("나"); //인덱스 1에 "나" 넣기
		list.add("다"); //인덱스 2에 "다" 넣기
		list.add(2, "라"); //인덱스 2에 "라"넣기. 그럼 이게 인덱스2로 올라가고, "다"는 인덱스3으로 밀림 
		list.add("마"); //인덱스 4에 "마" 넣기 
		System.out.println("현재 list 객체 상황: " + list);
		
		//인덱스의 개수 출력해보기. size()메소드 사용
		System.out.println("인덱스 총 객체수 : " + list.size()); //list의 길이 읽기
		System.out.println();
		
		//인덱스의 특정 번호 지정해서 읽어보기 
		System.out.println(list.get(3)); //list의 3번째값 읽기 
		System.out.println();
		
		//인덱스 개수만큼 반복문을 이용해서, 인덱스들 하나씩 출력해보기 
		for(int i=0; i<list.size(); i++) { //i=0부터 i<5까지 
			System.out.println("인덱스" + i + " : " + list.get(i));
		}
		System.out.println();
		//인덱스 삭제해보기 remove() 이용
		list.remove(2); //인덱스2 삭제되면서, 앞으로 하나씩 당겨짐 -> 라 삭제되고, 가나다마 됨
		list.remove(3); //인덱스3 삭제되면서, 앞으로 하나씩 당겨짐 -> 마 삭제되고, 가나다됨
		
		//다시 list 사이즈랑 + 남은 인덱스들 출력해보면 
		System.out.println("인덱스 삭제 후, 총 객체수 : " + list.size());
		System.out.println();
		System.out.println("현재 list 객체 상황: " + list);
		for(int i=0; i<list.size(); i++) {
			System.out.println("인덱스" + i + " : " + list.get(i));
		}
	}



}
