package chap13;

public class FirstPw <S, I> {
	private S str;
	private I num;
	
	public FirstPw(S str, I num) {
		this.str = str;
		this.num = num;
	}
	public S getStr() {
		return str;
	}

	public I getNum() {
		return num;
	}

} 