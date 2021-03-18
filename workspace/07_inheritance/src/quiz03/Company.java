package quiz03;

public class Company {

	private Staff[] staffList;
	private int idx;
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
		
	}
	public void hireStaff(Staff Staff) {
		if(idx==staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
		}
		staffList[idx++] = Staff;
		
	}
	public void staffInfo() {
		for(Staff staff : staffList) {
			if(staff !=null)
			{
				staff.info();
				}
			}
		System.out.println("salaryMan의 급여총액 : " + getSalaryManTotalPay());
	}
	//salaryman에게 지급된 급여의 총액
	
	public int getSalaryManTotalPay() {
		int salaryManTotalPay = 0;
		for(Staff staff : staffList) {
			if(staff instanceof SalaryMan) {
				if(!(staff instanceof SalesMan)) {
				salaryManTotalPay+=((SalaryMan) staff).getPay();
			}}
		}return salaryManTotalPay;
	}
}
