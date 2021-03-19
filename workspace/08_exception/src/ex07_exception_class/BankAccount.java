package ex07_exception_class;

public class BankAccount {

	private String accNo;
	private long balance;
	
	

	public BankAccount(String accNo,long balacne) {
		this.accNo=accNo;
		this.balance=balacne;
		
	}



	public void deposit(long l) throws DepositException {
		if(l<0) {
			throw new DepositException(l+"원 ,마이너스 입금은 불가능합니다.");
		}else {
		this.balance+=l;
		System.out.println(l+"입금하셨습니다.");
		
		// TODO Auto-generated method stub
		}
		
	}


	//실제 출금된 금액을 반환하는 메소드
	public long withdraw(long i) throws WithdrawException{
		if(i<0) {
			throw new WithdrawException("마이너스 출금은 불가능합니다.",2000);
			
		}else if(balance<i) {
			throw new WithdrawException("잔액이 부족합니다.",2001);
			
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

		try {
			you.deposit(withdraw(i));
		} catch (DepositException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch(WithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println("에러코드"+e.getErrorCode());
		}
	}
	
}
