package beans;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao()
	{
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao)
	{
		this.employeeDao = employeeDao;
	}
	
	public void transferMoney(long sourceEmployeeId, long targetEmployeeId, double amount)
	{
		Employee sourceEmployee = employeeDao.find(sourceEmployeeId);
		Employee targetEmployee = employeeDao.find(targetEmployeeId);
		
		sourceEmployee.setPaycheck(sourceEmployee.getPaycheck() - amount);
		targetEmployee.setPaycheck(targetEmployee.getPaycheck() + amount);
		
		employeeDao.update(sourceEmployee);
		employeeDao.update(targetEmployee);
	}
	
	public void withdrawMoney(long employeeId, double amount) throws Exception
	{
		Employee employee = employeeDao.find(employeeId);
		employee.setPaycheck(employee.getPaycheck() + amount);
		employeeDao.update(employee);
	}
	
	public Employee getEmployee(long employeeId)
	{
		return employeeDao.find(employeeId);
	}
}
