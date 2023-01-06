package testPage438;
//자동 리소스닫기
public class TryWithResourceExample   {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {  //객체생성
			fis.read();  //read메소드 작동
			throw new Exception();// 강제 예외 발생 -> close() 호출됨
			
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}