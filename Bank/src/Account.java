// 계좌 정보를 저장하고 입출금 메소드 및 정보를 저장하고 만들기 위해 필요한 클래스

public class Account {
	private int accountNum; // 계좌번호
	private int balance; // 잔액
	private static int number = 0; // 생성된 계좌수
	public static final int FEE = 500; // 다른사람에게 보내는 수수료를 500원으로 지정
	
	// 계좌 생성자 처음 계좌 생성시 계좌번호는 생성 순서대로 부여하고 
	// 처음 잔액은 생성계좌에 넣는 잔액만큼 생성하는 생성자
	public Account(int balance) {
		accountNum = ++number;
		this.balance = balance;
	}
	
	// 잔액조회하는 메소드
	public int getBalance() {
		return balance;
	}
	
	// 은행에 개설된 계좌의 개수 조회
	public static int getNumber() {
		return number;
	} 
	
	// 입금하는 메소드
	public int deposit(int money) {
		balance += money;
		return balance;
	}
	
	// 출금하는 메소드
	public int withdraw(int money) {
		//돈을 빼야할 금액이 잔고보다 많을 경우 실행하지 않는다.
		if(balance >= money) {
			balance -= money;
		}
		else
			System.out.println("잔고부족!");
		return balance;
	}
	
	// 송금 다른계좌로 송금, 송금 수수료 부과, 잔액부족하면 실패
	// 다른계좌와 송금할 금액이 매개변수
	public boolean transfer(Account other, int money) {
		if(balance >= money + FEE) {
			balance -= (money + FEE);
			other.balance += money;
			return true;
		}
		else
			return false;
	}
	
	// 계좌정보를 출력해줄 toString()메소드 재정의
	@Override
	public String toString() {
		return "계좌번호 = "+accountNum+", 잔액 = "+balance;
	}
	
}
