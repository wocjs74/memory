package Account;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) { //���� ��ȣ
		this.accountNo = accountNo;
	}
	public int deposit (int money) { //�Աޱ��
		balance = balance + money;
		return balance;
	}
	public int withdraw(int money) { //��ݱ��
		balance = balance - money;
		return balance;
	}
	public void showBalance() {		//�ܰ�Ȯ��
		System.out.println(balance);
	}
}
	//������ Account() ���¹�ȣ�� �Է��ϱ� ���� ������

	//deposit() �Ա��Ϸ��� �ݾ��� �޾� ������  balance�� �����ش�. �׷��� �Ű� ������ int������ �ް� return�� ���� int ������ return��

	//withdraw() ����Ϸ��� �ݾ��� �޾� ������ balance�� ���ش�. �׷��� deposit�� ���� return���� �Ű� ������ ����
	
	//showBalancer() ���� ��¸��� ���� ������� �ܼ�â�� balance ���