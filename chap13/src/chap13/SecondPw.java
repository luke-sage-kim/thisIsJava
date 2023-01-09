package chap13;

import java.util.Scanner;

public class SecondPw<S, I> {
	Scanner scanner = new Scanner(System.in);
	private S str;
	private I num;

	public SecondPw() {
	}

	public void setStr(S str) {
		this.str = str;
	}

	public S getStr() {
		return str;
	}

	public void setNum(I num) {
		this.num = num;
	}

	public I getNum() {
		return num;
	}

}