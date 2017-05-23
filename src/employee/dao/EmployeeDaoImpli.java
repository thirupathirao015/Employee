package employee.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import employee.model.Employee;
@Repository
public class EmployeeDaoImpli implements EmployeeDao {

	@Autowired
	private SessionFactory session;

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("saveemployee dao class");
		 employee.setAddeddate(new Date());
		 session.getCurrentSession().save(employee);

	}

	@Override
	public List<Employee> Employeelist() {
		 
		return ( List<Employee>) session.getCurrentSession().createCriteria(Employee.class).list();
	}

}
