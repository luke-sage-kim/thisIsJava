package chap05;

public class ScandinaEx {
	public static void main(String[] args) {
		Scandinavia countries = Scandinavia.NORWAY;
		String country = countries.name(); 
		
		switch(country) {
			case "DENMARK" :
			System.out.println("LEGO의 본고장");
			break;
			case "NORWAY" :
			System.out.println("대한민국의 연어, 고등어 담당");
			break;
			case "SWEDEN" :
			System.out.println("이케아와 수르스트뢰밍이 유명");
			break;
			case "FINLAND" :
			System.out.println("f1드라이버와 헤비메탈이 유명");
			break;}}}
