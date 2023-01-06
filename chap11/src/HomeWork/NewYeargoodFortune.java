package HomeWork;

public class NewYeargoodFortune {

	public static void main(String[] args) {
		StringBuilder goodFortune = new StringBuilder(); 
		
		goodFortune.append("새해새해 뽁 받으세요~ ");
	
		System.out.println(goodFortune.toString());
		
		goodFortune.replace(5,6, "복");
		System.out.println(goodFortune.toString());
		
		goodFortune.insert(6, " 많이"); 
		System.out.println(goodFortune.toString());

		
		goodFortune.delete(0, 2);
		System.out.println(goodFortune.toString());

		
		
	
		// "뽁"자리에 "복"을 대체하고 "복"이랑 "받으" 사이에 "많이"를 추가하고 중복된 새해를 지우시오
	}
}



