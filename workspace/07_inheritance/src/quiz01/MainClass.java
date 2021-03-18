package quiz01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan staff1= new SalaryMan("james", 300);
		System.out.println(staff1.getName());
		System.out.println(staff1.getPay());

		
		//판매직
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(3000);
		System.out.println(staff2.getName());
		System.out.println(staff2.getPay());
		
		//알바
		Alba Alba1 = new Alba("alba1");
		Alba1.setPayPerHour(1);
		Alba1.setTimes(200);
		System.out.println(Alba1.getName());
		System.out.println(Alba1.getPay());
	}

}
