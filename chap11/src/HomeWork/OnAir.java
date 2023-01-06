package HomeWork;
//다음 가사내용중 이름만 잘나오게하려면 다음 빈칸에 알맞을 말을 넣으시오
public class OnAir {
	public static void main(String[] args) {
		String lyrics = "BTSD봉준호V손흥민,UJayPark";
		
		String[] names = lyrics.split("D|V|U");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("Let's GO");
	}
}
