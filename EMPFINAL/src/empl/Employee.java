package empl;

import java.util.Date;

public class Employee {
	private String Employeeid;
	private String Employeename;
	private String Gender;
	private Date DateOfBirth;
	private String FullTimeEmployee;
	private String Department;
	private String Salary;

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getFullTimeEmployee() {
		return FullTimeEmployee;
	}

	public void setFullTimeEmployee(String fullTimeEmployee) {
		FullTimeEmployee = fullTimeEmployee;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(String employeeid) {
		Employeeid = employeeid;
	}

	public String getEmployeename() {
		return Employeename;
	}

	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

	public Employee() {
		super();

	}
}
