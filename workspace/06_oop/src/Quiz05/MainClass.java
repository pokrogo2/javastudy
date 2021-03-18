package Quiz05;

public class MainClass {
public static void main(String[] args) {
	
	BankAccount me = new BankAccount("1111",10000);
	BankAccount you = new BankAccount("9999",10000);
	//이체
	me.transfer(you,5000);//5000원이체
	me.transfer(you,-1000); //안됨
	me.transfer(you,7000); //초과
	
	
	
	
	//입금
	
	/*me.deposit(10000);
	me.deposit(-10000); // 마이너스 입금은 불가능합니다.
	
	you.withdraw(5000);
	you.withdraw(-1000); //마이너스 출금은 불가능합니다.
	you.withdraw(7000); //남은돈보다 많을경우 잔고부족
	
	me.inquiry(); // 계좌번호 : 1111, 잔액: 20000원
	you.inquiry();// 계좌번호 : 9999, 잔액 : 5000원
	*/

}
}
