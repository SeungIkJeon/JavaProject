import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account[] account = new Account[100];
		// 계좌가 너무 많을수 있으니 계좌제한을 100개로 한다.
		int menu = 0; // 메뉴 설정할 변수
		int money = 0; // 금액 결정할 변수
		int count = 0; // 계좌가 쌓이면 카운트해줄 변수
		int num = 0; // 계좌를 정할 변수
		int other = 0; // 계좌를 정할 변수
		
		do {
			System.out.print("1:계좌생성 2:입금 3:출금 4:송금 5:계좌조회 6:종료 : ");
			menu = input.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("계좌를 생성합니다.");
				System.out.print("계좌생성시 입금할 금액 : ");
				money = input.nextInt();
				account[count] = new Account(money);
				System.out.println(account[count].toString());
				count++; // 새로운 계좌를 인덱스가 1씩 옮겨진 곳에 저장하기 위함
				System.out.println();
				break;
			case 2:
				System.out.print("입금계좌 선택 : ");
				num = input.nextInt();
				// 계좌번호를 변수로 받기 때문에 배열로 들어갈때는 -1을 해준다.
				if(account[num-1]!=null) {
					System.out.print("입금할 금액 : ");
					account[num-1].deposit(input.nextInt());
					System.out.println("입금 후 잔액 : "+account[num-1].getBalance());
				} // 계좌 생성이 안된 계좌를 골라내는 방법
				else
					System.out.println("존재하지않는 계좌!");
				System.out.println();
				break;
			case 3:
				System.out.print("출금계좌 선택 : ");
				num = input.nextInt();
				if(account[num-1]!=null) {
					System.out.print("출금할 금액 : ");
					account[num-1].withdraw(input.nextInt());
					System.out.println("출금 후 잔액 : "+account[num-1].getBalance());
				}
				else
					System.out.println("존재하지않는 계좌!");
				System.out.println();
				break;
			case 4:
				System.out.print("송금계좌선택 : ");
				num = input.nextInt();
				if(account[num-1]!=null) {
					System.out.print("이체 계좌 : ");
					other = input.nextInt();
					if(account[other-1]!=null) {
						System.out.print("송금할 금액 : ");
						money = input.nextInt();
						account[num-1].transfer(account[other-1], money);
						System.out.println("잔액 : "+account[num-1].getBalance());
					}
					else
						System.out.println("송금받을 계좌가 존재하지않습니다.");
				}
				else
					System.out.println("송금할 계좌가 존재하지않습니다.");
				System.out.println();
				break;
			case 5:
				System.out.println("계좌조회");
				System.out.print("조회할 계좌 : ");
				num = input.nextInt();
				if(account[num-1]!=null)
					System.out.println(account[num-1].toString());
				else
					System.out.println("존재하지않는 계좌입니다.");
				System.out.println();
				break;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택해주세요~!");
			}
		}while(menu!=6);
	}
	
}
