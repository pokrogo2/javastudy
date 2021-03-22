package ex08_exception_class;

public class MainClass2 {

	public static void main(String[] args) throws BankAccountException{
		// TODO Auto-generated method stub

		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("1234", 10000);
		
		me.deposit(10000);
		me.withdraw(5616); //try/catch없이도 호출가능
		//그럼 메인메소드가 던진 exception은 어디로? >> JVM이 처리함.
	}

}
