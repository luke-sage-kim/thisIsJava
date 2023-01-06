package chap06;

public class Television {
	static String company = "Samsung"; //초기값주어짐
	static String model ="LCD"; //초기값주어짐
	static String info; //초기값이없음

	static {
		info = company + "-" + model;
	}
}
