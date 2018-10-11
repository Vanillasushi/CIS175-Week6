package beans;

public interface EmployeeService
{
	public void transferMoney(long sourceEmployeeId, long targetEmployeeId, double amount);
	public void withdrawMoney(long employeeId, double amount) throws Exception;
	public Employee getEmployee(long employeeId);
}
