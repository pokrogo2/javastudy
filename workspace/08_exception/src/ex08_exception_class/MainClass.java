package ex08_exception_class;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("1234", 10000);
		try {
			
		
		//me.deposit(-10000); //왜 호출안됨? deposit은 throws가있음. try catch처리해줘야함
		//me.withdraw(50000);
			me.transfer(you, 50000);
			
		//예외 발생시 진행안됨.
		}catch(BankAccountException e) {
			System.out.println("에러코드 " + e.getErrorCode());
			System.out.println(e.getMessage());
			
		}
		finally {
			me.inquiry();
			you.inquiry();
		}
	}

}
