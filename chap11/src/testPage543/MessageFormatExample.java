package testPage543;

import java.text.MessageFormat;

//매개 변수화된 문자열 형식
public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "김명현";
		String tel = "010-4628-5147";

		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();

		String sql = "insert into member values( {0}, {1}, {2})";
		Object[] arguments = {"'java'","'김명현'","'010-4628-5147'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
