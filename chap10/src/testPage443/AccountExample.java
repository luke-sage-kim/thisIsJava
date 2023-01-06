package testPage443;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		System.out.println("예금액" + account.getBalance());
		account.deposit(10000);
		System.out.println("예금액" + account.getBalance());

		// 출금하기
		try {
			account.withdraw(30000);
			System.out.println("예금액" + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // 예외메시지 얻기
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); // 예외 추적후 출력
			
		}
		
		

	}
}
