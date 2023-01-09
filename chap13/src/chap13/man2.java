package chap13;

public class man2 {
public static <T extends Number> int compareAge(T age1, T age2) {  //숫자를 상속받는다
	int one = age1.intValue();
	int two = age2.intValue();
	int big = one >= two ? one :two;//원이 투이상이냐 트루면 앞에꺼 팔스면 뒤에꺼
	return big;
	
}
}
