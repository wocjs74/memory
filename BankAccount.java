package Acoount2;

public class BankAccount {
	private String accountNo;
	private int balance;
	
	public  BankAccount(String accountNo) {
	this.accountNo = accountNo ; 
	}
	
	public  int deposit (int amount) {
	    balance = balance + amount;
	    return balance;
	}
	public int whithdraw(int amount) {
		balance = balance - amount;
		return balance;
	}
	public void checkMyBalance() {
		System.out.println(balance);
		
	}
}
