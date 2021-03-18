package quiz02;

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
	}
}
