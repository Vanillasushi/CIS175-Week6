package beans;

import	org.springframework.context.annotation.AnnotationConfigApplicationContext;
import	org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext = new	
		AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		EmployeeService	employeeService	=	applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println("Before paycheck transfer");
		System.out.println("Employee 1 Balance: " + employeeService.getEmployee(1).getPaycheck());
		System.out.println("Employee 2 Balance: " + employeeService.getEmployee(2).getPaycheck());
		
		employeeService.transferMoney(1,2,5);
		
		System.out.println("After paycheck transfer");
		System.out.println("Employee 1 Balance: " + employeeService.getEmployee(1).getPaycheck());
		System.out.println("Employee 2 Balance: " + employeeService.getEmployee(2).getPaycheck());
	}
}
