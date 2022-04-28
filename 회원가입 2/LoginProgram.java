package Capsulation;

import java.util.HashMap;
import java.util.Scanner;

public class LoginProgram {
	   private String id;
	    private String password;
	    static boolean loginFlag = false;
	    HashMap<String,String> memberTable = new HashMap<String,String>();
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getId() {
	        return id;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getPassword() {
	        return password;
	    }
	    //�޴� ��� �޼ҵ�
	    public char display() {
	        System.out.println("1.�α���   2.��  ��   3. �α׾ƿ�  4.����");
	        System.out.print(">>>");
	        return input().charAt(0);
	    }
	    
	    
	    //�Է� �޼ҵ�
	    public String input() {
	        Scanner sc = new Scanner(System.in);
	        return sc.nextLine();
	    }
	    
	    //ȸ������ �޼ҵ�
	    public void Join() {
	        if (loginFlag) {
	            System.out.println("�ڵ��α׾ƿ��ϰ� ���ο� ȸ�������� �����մϴ�.");
	            loginFlag = false;
	        }
	        while(true) {
	            System.out.print("���� id : ");
	            String newId = input();
	            if(memberTable.containsKey(newId)) {
	                System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
	                continue;
	            }
	            System.out.print("���� pw : ");
	            String newPwd = input();
	            memberTable.put(newId, newPwd);
	            break;
	        }
	        System.out.println("���� �Ϸ�");
	    }
	    //�α��� �޼ҵ�
	    public void loginVaild() {
	        if (loginFlag) {
	            System.out.println("�̹� �α��εǾ� �ִ� �����Դϴ�.");
	            return;
	        }
	    }    
	        
	        
	    public void isMemberCheck(String id, String pw) {    
	        if (memberTable.containsKey(id)) {
	            if (!memberTable.get(id).equals(pw)) {
	                System.out.println("��й�ȣ�� ���� �ʽ��ϴ�. ���� ����");
	            } else {
	                System.out.println("���� ����");
	                loginFlag = true;
	            }
	        } else {
	            System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
	        }
	    }
	    
	    //�α׾ƿ� �޼ҵ�
	    public void logout() {
	        if (!loginFlag) {
	            System.out.println("���� ����� �α����� �ʿ��մϴ�.");
	            return;
	        }
	        System.out.println("�α׾ƿ� �մϴ�.");
	        loginFlag = false;
	    }
	}
	