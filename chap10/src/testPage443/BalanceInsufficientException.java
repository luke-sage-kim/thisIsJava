package testPage443;
//사용자 정의 예외와 예외발생
public class BalanceInsufficientException extends Exception {  //사용자정의 예외
	public BalanceInsufficientException() {
	}

	public BalanceInsufficientException(String message) {
		super(message);//부모 모셔와
	}
}
