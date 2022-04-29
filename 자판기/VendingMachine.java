package 자판기;

import java.util.*;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money,choice,change= 0; //들어갈 금액 ,음료 선택 , 잔돈
		int cokeZero = 1200; //콜라
		int sprite = 1100;	//스프라이트
		int orangejuice = 1000;	//오렌지주스
		int oneThousandwon, fiveHundredWon , oneHundredWon = 0;  // 천원,  오백원 , 백원
		String con; //추가 구매
		
		//금액입력
		
		System.out.println("금액을 입력하세요");
		money = sc.nextInt();
		
		//메뉴 선택
		
		System.out.println("메뉴 입력하세요.");
		System.out.println("1번 coke zero (1200) | 2번 sprite (1100) | 3번 orangeJuice (1000)");
		choice=sc.nextInt();
		
		//금액 입력과 메뉴를 선택한이후 받게될 잔돈구하기 또는 돈이 부족한지 확인하기
		
		if(choice == 1 && money >cokeZero) {
			change=money-cokeZero;
		}else if(choice == 2 && money > sprite) {
				change=money-sprite;
		}else if(choice == 3 && money >orangejuice) {
					change=money-orangejuice;
				}else {
					change = money;
					System.out.println("돈이 부족합니다.");
					
				}
	
		if(money < change ) {
			System.out.println("잔액이 부족합니다.");
			System.exit(0);
		}
		 else {
			money = money - change;
			
			System.out.println("잔액은 " +money +"원 입니다.");
			System.out.println("추가 선택을 하시겠습니까?(y/n");
			con=sc.next();
			
			if(con.equals("n")||con.equals("N"))
				return;
			
			System.out.println();
		 
		 
		}
				System.out.println("잔돈"+change+"원");
	
				oneThousandwon = change/1000;
				fiveHundredWon = change%1000/500;
				oneHundredWon = change%1000/500/100;
				System.out.println("천원 " + oneThousandwon + "개");
				System.out.println("오백원" + fiveHundredWon + "개");
				System.out.println("백원" + oneHundredWon + "개");
	}
	
	
		
	}
