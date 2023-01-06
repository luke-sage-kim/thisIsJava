package testPage76;
// char타입 연산
public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;  //자동으로 int로 타입변환해서 계산한후 char로 콘솔창에 출력됨
		char c2 = 'A';
		// char c3 = c2 + 1; // 컴파일 에러
		//char c3 = (char) (c2 + 1);  이렇게 강제 터압변환을해서 값을 얻어야한다
		System.out.println("c1: " + c1); //A는 65라는 유니코드를 가져서 66 근데 66은 유니코드로B라서 B로 출력됨
		System.out.println("c2: " + c2);
		// System.out.println("c3: " + c3);
	}
}
