package ���Ǳ�;

import java.util.*;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money,choice,change= 0; //�� �ݾ� ,���� ���� , �ܵ�
		int cokeZero = 1200; //�ݶ�
		int sprite = 1100;	//��������Ʈ
		int orangejuice = 1000;	//�������ֽ�
		int oneThousandwon, fiveHundredWon , oneHundredWon = 0;  // õ��,  ����� , ���
		String con; //�߰� ����
		
		//�ݾ��Է�
		
		System.out.println("�ݾ��� �Է��ϼ���");
		money = sc.nextInt();
		
		//�޴� ����
		
		System.out.println("�޴� �Է��ϼ���.");
		System.out.println("1�� coke zero (1200) | 2�� sprite (1100) | 3�� orangeJuice (1000)");
		choice=sc.nextInt();
		
		//�ݾ� �Է°� �޴��� ���������� �ްԵ� �ܵ����ϱ� �Ǵ� ���� �������� Ȯ���ϱ�
		
		if(choice == 1 && money >cokeZero) {
			change=money-cokeZero;
		}else if(choice == 2 && money > sprite) {
				change=money-sprite;
		}else if(choice == 3 && money >orangejuice) {
					change=money-orangejuice;
				}else {
					change = money;
					System.out.println("���� �����մϴ�.");
					
				}
	
		if(money < change ) {
			System.out.println("�ܾ��� �����մϴ�.");
			System.exit(0);
		}
		 else {
			money = money - change;
			
			System.out.println("�ܾ��� " +money +"�� �Դϴ�.");
			System.out.println("�߰� ������ �Ͻðڽ��ϱ�?(y/n");
			con=sc.next();
			
			if(con.equals("n")||con.equals("N"))
				return;
			
			System.out.println();
		 
		 
		}
				System.out.println("�ܵ�"+change+"��");
	
				oneThousandwon = change/1000;
				fiveHundredWon = change%1000/500;
				oneHundredWon = change%1000/500/100;
				System.out.println("õ�� " + oneThousandwon + "��");
				System.out.println("�����" + fiveHundredWon + "��");
				System.out.println("���" + oneHundredWon + "��");
	}
	
	
		
	}
