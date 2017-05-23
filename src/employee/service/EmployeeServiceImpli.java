package employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import employee.dao.EmployeeDao;
import employee.model.Employee;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpli implements EmployeeService {
	
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void saveEmployee(Employee employee) {
		 
		employeeDao.saveEmployee(employee);
		System.out.println("save employee serviceimpli");

	}

	@Override
	public List<Employee> Employeelist() {
		 
		return employeeDao.Employeelist();
	}

}
