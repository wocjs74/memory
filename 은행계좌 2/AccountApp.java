package Account;

import java.util.Scanner;

public class AccountApp {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드로 부터 입력 받기위한 클래스 생성
		boolean run = true;    //run = while문에 사용하고 있으며 run을 기본값 true로 만들어 run이 false가 될때까지 계속 반속하게 만듬
		int money;
		
		Account account = new Account ("312-89562-123456");
		//작성해놓은 Account.java를 사용하기 위해 클래스 생성하고 생성자를 이용해 계좌번호로 초기화 해줌
		while(run) { // 반복을 위해 while문을 만듬
			System.out.println(" ");
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			
			int menuNo = sc.nextInt();
			
			switch(menuNo) { // switch - case 조건에 따라 해당 기능을 실행하도록 만듬
			
			case 1:
				System.out.println("예금액>");
				money  = sc.nextInt();
				account.deposit(money);
				break;
				
			case 2:
				System.out.println("출금액>");
				money = sc.nextInt();
				account.withdraw(money);
				break;
			case 3:
				System.out.println("잔고액>");
				account.showBalance();
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
				
				default : 
					System.out.println("다시입력해주세요");
					continue;
			}
			
		}
		sc.close();
	}
}
