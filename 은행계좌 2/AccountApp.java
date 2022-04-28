package Account;

import java.util.Scanner;

public class AccountApp {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //Ű����� ���� �Է� �ޱ����� Ŭ���� ����
		boolean run = true;    //run = while���� ����ϰ� ������ run�� �⺻�� true�� ����� run�� false�� �ɶ����� ��� �ݼ��ϰ� ����
		int money;
		
		Account account = new Account ("312-89562-123456");
		//�ۼ��س��� Account.java�� ����ϱ� ���� Ŭ���� �����ϰ� �����ڸ� �̿��� ���¹�ȣ�� �ʱ�ȭ ����
		while(run) { // �ݺ��� ���� while���� ����
			System.out.println(" ");
			System.out.println("----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------");
			System.out.println("����>");
			
			int menuNo = sc.nextInt();
			
			switch(menuNo) { // switch - case ���ǿ� ���� �ش� ����� �����ϵ��� ����
			
			case 1:
				System.out.println("���ݾ�>");
				money  = sc.nextInt();
				account.deposit(money);
				break;
				
			case 2:
				System.out.println("��ݾ�>");
				money = sc.nextInt();
				account.withdraw(money);
				break;
			case 3:
				System.out.println("�ܰ��>");
				account.showBalance();
				break;
			case 4:
				System.out.println("���α׷� ����");
				run = false;
				break;
				
				default : 
					System.out.println("�ٽ��Է����ּ���");
					continue;
			}
			
		}
		sc.close();
	}
}
