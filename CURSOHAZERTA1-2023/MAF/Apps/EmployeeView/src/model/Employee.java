package model;

import java.util.Date;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Employee {
	private String name;
	private String email;
	private int salary;
	private Date hireDate;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
			this);
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String email, int salary, Date hireDate) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void addPropertyChangeListener(PropertyChangeListener l) {
		propertyChangeSupport.addPropertyChangeListener(l);
	}
	public void removePropertyChangeListener(PropertyChangeListener l) {
		propertyChangeSupport.removePropertyChangeListener(l);
	}
	public void setName(String name) {
		String oldName = this.name;
		this.name = name;
		propertyChangeSupport.firePropertyChange("name", oldName, name);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		String oldEmail = this.email;
		this.email = email;
		propertyChangeSupport.firePropertyChange("email", oldEmail, email);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		int oldSalary = this.salary;
		this.salary = salary;
		propertyChangeSupport.firePropertyChange("salary", oldSalary, salary);
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		Date oldHireDate = this.hireDate;
		this.hireDate = hireDate;
		propertyChangeSupport.firePropertyChange("hireDate", oldHireDate, hireDate);
	}

}
