package Acoount2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bank = new BankAccount("�����");
		boolean run = true;
	int amount;
		
	while(run) {
		System.out.println();
		System.out.println("===============================");
		System.out.println("1.�Ա� | 2.��� | 3.�ܾ���ȸ |4.����");
		System.out.println("===============================");
		
		int menu = scanner.nextInt();
		switch(menu){
			case 1 :
				System.out.println("�Ա�");
				amount = scanner.nextInt();
				bank.deposit(amount);
				break;
			case 2 : 
				System.out.println("���");
				amount = scanner.nextInt();
				bank.whithdraw(amount);
				break;
			case 3 :
				System.out.println("�ܾ���ȸ");
				bank.checkMyBalance();
				break;
			
			case 4 : 
				System.out.println("���α׷� ����");
				run = false;
				break;
				
				default :
				System.out.println("�ٽ��Է����ּ���.");
		
		
		}
	}

	}
}

		
	
	

