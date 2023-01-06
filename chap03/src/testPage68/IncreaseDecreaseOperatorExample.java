package testPage68;
//증감연산자
public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------------------");
		x++; // 11
		System.out.println("x=" + x); // 11
		++x; // 12
		System.out.println("x=" + x); // 12
		
		System.out.println("---------------------------------");
		y--; // 9
		System.out.println("y=" + y); // 9
		--y; // 8
		System.out.println("y=" + y); // 8    증감연산자만 있는겨우에는 증감연산자가 변수 앞 또는 뒤 어디든 위치해도 노상관
		
		System.out.println("---------------------------------");
		z = x++; //ㅋ에 넣은후에 x증가를한다
		//z = ++x; 만약에 이렇게했으면 z에 13
		System.out.println("z=" + z); // 12 
		System.out.println("x=" + x); // 13
		
		System.out.println("---------------------------------");
		z = ++x; // 14
		System.out.println("z=" + z); // 14
		System.out.println("x=" + x); // 14
		
		System.out.println("---------------------------------");
		z = ++x + y++; // 15 + 8
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
	}
}
