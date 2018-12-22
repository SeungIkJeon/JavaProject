// ���� ������ �����ϰ� ����� �޼ҵ� �� ������ �����ϰ� ����� ���� �ʿ��� Ŭ����

public class Account {
	private int accountNum; // ���¹�ȣ
	private int balance; // �ܾ�
	private static int number = 0; // ������ ���¼�
	public static final int FEE = 500; // �ٸ�������� ������ �����Ḧ 500������ ����
	
	// ���� ������ ó�� ���� ������ ���¹�ȣ�� ���� ������� �ο��ϰ� 
	// ó�� �ܾ��� �������¿� �ִ� �ܾ׸�ŭ �����ϴ� ������
	public Account(int balance) {
		accountNum = ++number;
		this.balance = balance;
	}
	
	// �ܾ���ȸ�ϴ� �޼ҵ�
	public int getBalance() {
		return balance;
	}
	
	// ���࿡ ������ ������ ���� ��ȸ
	public static int getNumber() {
		return number;
	} 
	
	// �Ա��ϴ� �޼ҵ�
	public int deposit(int money) {
		balance += money;
		return balance;
	}
	
	// ����ϴ� �޼ҵ�
	public int withdraw(int money) {
		//���� ������ �ݾ��� �ܰ��� ���� ��� �������� �ʴ´�.
		if(balance >= money) {
			balance -= money;
		}
		else
			System.out.println("�ܰ����!");
		return balance;
	}
	
	// �۱� �ٸ����·� �۱�, �۱� ������ �ΰ�, �ܾ׺����ϸ� ����
	// �ٸ����¿� �۱��� �ݾ��� �Ű�����
	public boolean transfer(Account other, int money) {
		if(balance >= money + FEE) {
			balance -= (money + FEE);
			other.balance += money;
			return true;
		}
		else
			return false;
	}
	
	// ���������� ������� toString()�޼ҵ� ������
	@Override
	public String toString() {
		return "���¹�ȣ = "+accountNum+", �ܾ� = "+balance;
	}
	
}
