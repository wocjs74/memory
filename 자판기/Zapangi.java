package 자판기;

import java.util.Scanner;

public class Zapangi {
	static Scanner sc = new Scanner (System.in);
	final static int Coke = 600; //콜라
	final static int Fanta = 550; //환타
	final static int Coffee = 370 ; //커피
	final static int Water = 420 ; //물
	final static String D1 = "콜라";
	final static String D2 = "환타";
	final static String D3 = "커피";
	final static String D4 = "물";
	static int money; //금액
	static int t_money= 0; //임시저장소
	
	public static void main(String args[]) {
		char exit; //종료체킹을 위한 변수
		
		System.out.println("자판기 테스트");
		System.out.println("---------------------------------------------------");
		System.out.println("1.콜라(600) | 2.환타(550) |3.커피 (370) |4.물 (420)");
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		money=0; //체킹을 위한 초기값
		//System.out.println(">>Main money1 : "+money);
		
		while(true) {
			if(money==0) {
				money = InputCoin();
				//System.out.println(">>Main money2 : "+money);
			}
		SelectDrink(money);
		System.out.println("추가 선택 하시겠습까(y/n)?");
		exit = sc.next().charAt(0);
		
		money = t_money;
		
		if(exit == 'n' || exit == 'N') {// 종료 체킹
			System.out.println("system exit");
			break;
		}
		System.out.println(">>Main money3 : "+money);
		System.out.println();
		}
		
	
	}

	static void ChangePay(int money,int s,String drink) { //거스름돈
		int temp;
		int m_1000,m_500,m_100;
		char sel;
		
		//System.out.println(">>ChangePay Money1: "+ money);
		
		if(money < s) {//소지금보다 음료수가 비쌀경우
			System.out.println("Erroe select money < drink");
			System.out.println("금액을 더 넣으시겠습니까(y/n)?");
			sel = sc.next().charAt(0);
			if(sel == 'y') //추가입금
				InputCoin();
			else if(sel == 'n') { // 프로그램 종료
				System.out.println("exit program");
				System.exit(0);
			}
			else 
				SelectDrink(money);
		}
		else { //거스름돈 계산
			money -= s;
			m_1000 = money / 1000; //1000
			temp = money % 1000;
			m_500  = money / 500; //500
			temp = money % 1000;
			m_100 = money / 100; //100
			temp = money % 100;
			
			System.out.println();
			System.out.println("=======================================");
			System.out.print("뽑으신 음료수는"+drink+"이며 거스름돈은"+money+"원 입니다.");
			System.out.print("1000원 :" + m_1000 + " , ");
			System.out.print("500원 :" + m_500 + " , ");
			System.out.print("100원 :"+ m_100 + " , ");
			System.out.println("10원 :" + temp);
			System.out.println("========================================");
			System.out.println();
			
			//System.out.println(">>ChangePay Money2: "+ money);
			t_money = money;
		}
	}
			static void SelectDrink(int money) {
				int sel;
				
				System.out.println("음료수를 선택하세요");
				sel = (int)(sc.next().charAt(0))-48;
				//System.out.println("select number = " +sel);
				
				if (sel < 1 || sel > 4) {//없는 음료 선택시 SelectDrink()호출
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
				System.out.println("금액을 입력하세요.");
				money = sc.nextInt();
				money += t_money;
				t_money = money;
				return money;
				
				
			}
	}
