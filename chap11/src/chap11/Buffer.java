package chap11;

public class Buffer {
public static void main(String[] args) {
	String data = "ABC";
	
	data = data + "DEF";// 더하는게 아니라 새로운 객체를 만드는 것이다.
			System.out.println(data);
}
}
