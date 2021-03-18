package Quiz05;

public class BankAccount {

	private String accNo;
	private long balance;
	
	

	public BankAccount(String accNo,long balacne) {
		this.accNo=accNo;
		this.balance=balacne;
		
	}



	public void deposit(long l) {
		if(l<0) {
			System.out.println("마이너스 입금은 불가능합니다.");
		}else {
		this.balance+=l;
		System.out.println(l+"입금하셨습니다.");
		
		// TODO Auto-generated method stub
		}
		
	}


	//실제 출금된 금액을 반환하는 메소드
	public long withdraw(long i) {
		if(i<0) {
			System.out.println("마이너스 출금은 불가능합니다.");
			return 0;
		}else if(balance<i) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		
		else {
			this.balance-=i;
			
			System.out.println(i+"출금하셨습니다.");
			return i;
		}
		// TODO Auto-generated method stub
		
	}



	public void inquiry() {
		// TODO Auto-generated method stub
		System.out.println("계좌번호 : " + accNo + ", 잔액 : "+ balance);
	}



	public void transfer(BankAccount you, long i) {

		you.deposit(withdraw(i));
	}
	
}
