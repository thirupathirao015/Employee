package employee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Employee11")
public class Employee {
	 
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int empid;
	
	@Column(name="E_name",nullable = false, length=20)
	@NotEmpty(message="name must be required")
	@Size(min=4,max=30)
	private String ename;
	
	@Column(name="salary")
	private Long salary;
	
	@Column(name="date_added")
	private  Date addeddate;
	
	public Employee(){
		
	}

	public Employee(int empid, String ename, Long salary, Date addeddate) {
		//super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.addeddate = addeddate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	
	

}
