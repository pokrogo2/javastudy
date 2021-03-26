package dto;

import java.sql.Date;

public class Dto {

	private int num;
	private String name;
	private String department;
	private Date hireDate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	//정보출력
	@Override
	public String toString() {
		return "Dto [num=" + num + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
}
