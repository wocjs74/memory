package Capsulation;

import java.util.Scanner;

public class Join {
public static void main(String[] args) {
	
/*
 * =====ȸ������======
 * ���̵�>admin
 * ��й�ȣ(4�ڸ�����)>1234
 * �̸�>ȫ�浿
 * ����>50
 * Ű>185.5
 * ================
 * ȸ�����ԿϷ�!!!
 * ====������========
 * ���̵�:admin
 * ��й�ȣ:1234
 * �̸�: ȫ�浿
 * ����: 50��
 * Ű : 185.5cm
 * =================
 */

	Scanner sc = new Scanner (System.in);
	System.out.println("=======ȸ������=======");
	
	System.out.println("���̵�>");
	String myid=sc.nextLine();
	
	System.out.print("��й�ȣ(4�ڸ�����)>");
	int myNum = Integer.parseInt(sc.nextLine());
	
	System.out.println("�̸�>");
	String myName = sc.nextLine();
	
	System.out.println("����>");
	int myage = Integer.parseInt(sc.nextLine());
	
	System.out.println("Ű>");
	double mytall = Double.parseDouble(sc.nextLine());
	System.out.println("======================\nȸ�����ԿϷ�!!\n======== ������========");
	System.out.println("���̵�:"+myid);
	System.out.println("��й�ȣ:"+myNum);
	System.out.println("�̸�:"+myName);
	System.out.println("����:"+myage);
	System.out.println("Ű:"+mytall);
	System.out.println("====================");
}}