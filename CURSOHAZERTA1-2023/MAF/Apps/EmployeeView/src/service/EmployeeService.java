package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.Employee;

public class EmployeeService {
	
	private List employeeList = null;

	public EmployeeService() {
	super();
	}

	public Employee[] getEmployees() { 
	//This Method gets a list of the employees and their emails 
	Employee[] employees = null; 
	employeeList = new ArrayList(); 
	employeeList.add(new Employee("Bill", "bill@oracle.com",4000, getADate(2011,3,24,9,0) )) ; 
	employeeList.add(new Employee("Gary", "gary@oracle.com", 5000, getADate(2007,2,24,9,0) )) ; 
	employeeList.add(new Employee("Jeff", "jeff@oracle.com", 5500, getADate(2003,2,19,9,0) )) ; 
	employeeList.add(new Employee("Joe", "joe@oracle.com", 4000, getADate(2012,2,13,9,0) )) ; 
	employeeList.add(new Employee("Shay", "shay@oracle.com",6000, getADate(2002,2,21,9,0) )) ; 
	employees = (Employee[]) employeeList.toArray(new Employee[employeeList.size()]); 
	return employees; 
	} 

	private Date getADate(int y,int m, int d,int h, int mi) { 
	Calendar c1 = Calendar.getInstance(); 
	c1.set(y, m, d, h, mi); 
	Date retDate = c1.getTime(); 
	return retDate; 
	}

}
