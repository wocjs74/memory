package Account;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) { //계좌 번호
		this.accountNo = accountNo;
	}
	public int deposit (int money) { //입급기능
		balance = balance + money;
		return balance;
	}
	public int withdraw(int money) { //출금기능
		balance = balance - money;
		return balance;
	}
	public void showBalance() {		//잔고확인
		System.out.println(balance);
	}
}
	//생성자 Account() 계좌번호를 입력하기 위한 생성자

	//deposit() 입금하려는 금액을 받아 기존의  balance에 더해준다. 그래서 매개 변수를 int형으로 받고 return값 또한 int 형으로 return함

	//withdraw() 출금하려는 금액을 받아 기존의 balance에 빼준다. 그래서 deposit과 같은 return값과 매개 변수를 받음
	
	//showBalancer() 오직 출력만을 위한 기능으로 콘솔창이 balance 출력