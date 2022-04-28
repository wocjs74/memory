package Capsulation;

import java.util.Scanner;

public class Join {
public static void main(String[] args) {
	
/*
 * =====회원가입======
 * 아이디>admin
 * 비밀번호(4자리숫자)>1234
 * 이름>홍길동
 * 나이>50
 * 키>185.5
 * ================
 * 회원가입완료!!!
 * ====내정보========
 * 아이디:admin
 * 비밀번호:1234
 * 이름: 홍길동
 * 나이: 50세
 * 키 : 185.5cm
 * =================
 */

	Scanner sc = new Scanner (System.in);
	System.out.println("=======회원가입=======");
	
	System.out.println("아이디>");
	String myid=sc.nextLine();
	
	System.out.print("비밀번호(4자리숫자)>");
	int myNum = Integer.parseInt(sc.nextLine());
	
	System.out.println("이름>");
	String myName = sc.nextLine();
	
	System.out.println("나이>");
	int myage = Integer.parseInt(sc.nextLine());
	
	System.out.println("키>");
	double mytall = Double.parseDouble(sc.nextLine());
	System.out.println("======================\n회원가입완료!!\n======== 내정보========");
	System.out.println("아이디:"+myid);
	System.out.println("비밀번호:"+myNum);
	System.out.println("이름:"+myName);
	System.out.println("나이:"+myage);
	System.out.println("키:"+mytall);
	System.out.println("====================");
}}