package Acoount2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bank = new BankAccount("김덕배");
		boolean run = true;
	int amount;
		
	while(run) {
		System.out.println();
		System.out.println("===============================");
		System.out.println("1.입급 | 2.출금 | 3.잔액조회 |4.종료");
		System.out.println("===============================");
		
		int menu = scanner.nextInt();
		switch(menu){
			case 1 :
				System.out.println("입금");
				amount = scanner.nextInt();
				bank.deposit(amount);
				break;
			case 2 : 
				System.out.println("출금");
				amount = scanner.nextInt();
				bank.whithdraw(amount);
				break;
			case 3 :
				System.out.println("잔액조회");
				bank.checkMyBalance();
				break;
			
			case 4 : 
				System.out.println("프로그램 종료");
				run = false;
				break;
				
				default :
				System.out.println("다시입력해주세요.");
		
		
		}
	}

	}
}

		
	
	

