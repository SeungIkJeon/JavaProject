import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account[] account = new Account[100];
		// ���°� �ʹ� ������ ������ ���������� 100���� �Ѵ�.
		int menu = 0; // �޴� ������ ����
		int money = 0; // �ݾ� ������ ����
		int count = 0; // ���°� ���̸� ī��Ʈ���� ����
		int num = 0; // ���¸� ���� ����
		int other = 0; // ���¸� ���� ����
		
		do {
			System.out.print("1:���»��� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:���� : ");
			menu = input.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("���¸� �����մϴ�.");
				System.out.print("���»����� �Ա��� �ݾ� : ");
				money = input.nextInt();
				account[count] = new Account(money);
				System.out.println(account[count].toString());
				count++; // ���ο� ���¸� �ε����� 1�� �Ű��� ���� �����ϱ� ����
				System.out.println();
				break;
			case 2:
				System.out.print("�Աݰ��� ���� : ");
				num = input.nextInt();
				// ���¹�ȣ�� ������ �ޱ� ������ �迭�� ������ -1�� ���ش�.
				if(account[num-1]!=null) {
					System.out.print("�Ա��� �ݾ� : ");
					account[num-1].deposit(input.nextInt());
					System.out.println("�Ա� �� �ܾ� : "+account[num-1].getBalance());
				} // ���� ������ �ȵ� ���¸� ��󳻴� ���
				else
					System.out.println("���������ʴ� ����!");
				System.out.println();
				break;
			case 3:
				System.out.print("��ݰ��� ���� : ");
				num = input.nextInt();
				if(account[num-1]!=null) {
					System.out.print("����� �ݾ� : ");
					account[num-1].withdraw(input.nextInt());
					System.out.println("��� �� �ܾ� : "+account[num-1].getBalance());
				}
				else
					System.out.println("���������ʴ� ����!");
				System.out.println();
				break;
			case 4:
				System.out.print("�۱ݰ��¼��� : ");
				num = input.nextInt();
				if(account[num-1]!=null) {
					System.out.print("��ü ���� : ");
					other = input.nextInt();
					if(account[other-1]!=null) {
						System.out.print("�۱��� �ݾ� : ");
						money = input.nextInt();
						account[num-1].transfer(account[other-1], money);
						System.out.println("�ܾ� : "+account[num-1].getBalance());
					}
					else
						System.out.println("�۱ݹ��� ���°� ���������ʽ��ϴ�.");
				}
				else
					System.out.println("�۱��� ���°� ���������ʽ��ϴ�.");
				System.out.println();
				break;
			case 5:
				System.out.println("������ȸ");
				System.out.print("��ȸ�� ���� : ");
				num = input.nextInt();
				if(account[num-1]!=null)
					System.out.println(account[num-1].toString());
				else
					System.out.println("���������ʴ� �����Դϴ�.");
				System.out.println();
				break;
			case 6:
				System.out.println("����");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �������ּ���~!");
			}
		}while(menu!=6);
	}
	
}
