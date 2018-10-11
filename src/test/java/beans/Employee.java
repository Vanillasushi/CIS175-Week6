package beans;

import java.util.Date;

public class Employee
{
	private long id;
	private String name;
	private String phone;
	private double paycheck;
	private Date hireDate;
	
	public Employee()
	{
		// empty
	}
	
	public Employee(long id, String name, double paycheck)
	{
		this.id = id;
		this.name = name;
		this.paycheck = paycheck;
	}

	// Generated gets and sets
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getPaycheck() {
		return paycheck;
	}
	public void setPaycheck(double paycheck) {
		this.paycheck = paycheck;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
