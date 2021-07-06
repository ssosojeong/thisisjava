package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("잔액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(100000);
			System.out.println("잔액: " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			System.out.println();
			//printStackTrace보다 간단하게 출력
			System.out.println(e.toString());	 
		}
	}

}
