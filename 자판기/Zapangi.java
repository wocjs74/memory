package ���Ǳ�;

import java.util.Scanner;

public class Zapangi {
	static Scanner sc = new Scanner (System.in);
	final static int Coke = 600; //�ݶ�
	final static int Fanta = 550; //ȯŸ
	final static int Coffee = 370 ; //Ŀ��
	final static int Water = 420 ; //��
	final static String D1 = "�ݶ�";
	final static String D2 = "ȯŸ";
	final static String D3 = "Ŀ��";
	final static String D4 = "��";
	static int money; //�ݾ�
	static int t_money= 0; //�ӽ������
	
	public static void main(String args[]) {
		char exit; //����üŷ�� ���� ����
		
		System.out.println("���Ǳ� �׽�Ʈ");
		System.out.println("---------------------------------------------------");
		System.out.println("1.�ݶ�(600) | 2.ȯŸ(550) |3.Ŀ�� (370) |4.�� (420)");
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		money=0; //üŷ�� ���� �ʱⰪ
		//System.out.println(">>Main money1 : "+money);
		
		while(true) {
			if(money==0) {
				money = InputCoin();
				//System.out.println(">>Main money2 : "+money);
			}
		SelectDrink(money);
		System.out.println("�߰� ���� �Ͻðڽ���(y/n)?");
		exit = sc.next().charAt(0);
		
		money = t_money;
		
		if(exit == 'n' || exit == 'N') {// ���� üŷ
			System.out.println("system exit");
			break;
		}
		System.out.println(">>Main money3 : "+money);
		System.out.println();
		}
		
	
	}

	static void ChangePay(int money,int s,String drink) { //�Ž�����
		int temp;
		int m_1000,m_500,m_100;
		char sel;
		
		//System.out.println(">>ChangePay Money1: "+ money);
		
		if(money < s) {//�����ݺ��� ������� ��Ұ��
			System.out.println("Erroe select money < drink");
			System.out.println("�ݾ��� �� �����ðڽ��ϱ�(y/n)?");
			sel = sc.next().charAt(0);
			if(sel == 'y') //�߰��Ա�
				InputCoin();
			else if(sel == 'n') { // ���α׷� ����
				System.out.println("exit program");
				System.exit(0);
			}
			else 
				SelectDrink(money);
		}
		else { //�Ž����� ���
			money -= s;
			m_1000 = money / 1000; //1000
			temp = money % 1000;
			m_500  = money / 500; //500
			temp = money % 1000;
			m_100 = money / 100; //100
			temp = money % 100;
			
			System.out.println();
			System.out.println("=======================================");
			System.out.print("������ �������"+drink+"�̸� �Ž�������"+money+"�� �Դϴ�.");
			System.out.print("1000�� :" + m_1000 + " , ");
			System.out.print("500�� :" + m_500 + " , ");
			System.out.print("100�� :"+ m_100 + " , ");
			System.out.println("10�� :" + temp);
			System.out.println("========================================");
			System.out.println();
			
			//System.out.println(">>ChangePay Money2: "+ money);
			t_money = money;
		}
	}
			static void SelectDrink(int money) {
				int sel;
				
				System.out.println("������� �����ϼ���");
				sel = (int)(sc.next().charAt(0))-48;
				//System.out.println("select number = " +sel);
				
				if (sel < 1 || sel > 4) {//���� ���� ���ý� SelectDrink()ȣ��
					System.out.println("Erroe input select again 1~4");
				//System.out.println(">>Add Coint money :" +money);
					SelectDrink(money);
				}
				else {
					switch(sel) {
					case 1:
						ChangePay(money,Coke,D1);
						break;
					case 2:
						ChangePay(money,Fanta,D2);
						break;
					case 3:
						ChangePay(money,Coffee,D3);
						break;
					case 4:
						ChangePay(money,Water,D4);
						break;
						default:
							System.out.println("Swith error");
							break;
					}
					//System.out.println("<<t_money :"+t_money);
				}
			}
			static int InputCoin() {
				System.out.println("�ݾ��� �Է��ϼ���.");
				money = sc.nextInt();
				money += t_money;
				t_money = money;
				return money;
				
				
			}
	}
