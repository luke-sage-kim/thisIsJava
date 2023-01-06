package testPage443;

public class Account {

	private long balance; // 발란스 롱변수

	public Account() {  //아무것도 안해서 기본값이 들어감
	}

	public long getBalance() {
		return balance; // balance값 반환 아마 잔고
	}

	public void deposit(int money) { // 입금용 메소드  예금
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException { // 돈 인출
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족" + (money - balance) + "모자람");
		}

		balance -= money;

	}

}
