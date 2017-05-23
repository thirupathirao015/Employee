package employee.dao;

import java.util.List;

import employee.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);
	
	public List<Employee> Employeelist();

}
