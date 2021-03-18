package quiz03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan staff1= new SalaryMan("james", 300);
		SalaryMan staff3= new SalaryMan("Dafi", 400);

		
		//판매직
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(3000);

		//알바

		Alba Alba1 = new Alba("alba1");
		Alba1.setPayPerHour(1);
		Alba1.setTimes(200);
		Alba Alba2 = new Alba("alba2");
		Alba1.setPayPerHour(2);
		Alba1.setTimes(300);
		
		
		Company company = new Company(10);
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.hireStaff(Alba1);
		company.hireStaff(Alba2);
		company.staffInfo();
	}

}
