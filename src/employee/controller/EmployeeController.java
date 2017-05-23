package employee.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import employee.model.Employee;
import employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;//ModelAndView new ModelAndView()
	
	@RequestMapping(value ="/saveemployee", method = RequestMethod.POST)
	public String  saveEmployee( @ModelAttribute("employee") @Valid Employee  employee,
			BindingResult result ,Map<String, Employee> model) {
		
		
		if(result.hasErrors())
		{
			System.out.println("error page display");
			return "employee";
		}
		Employee employe=new Employee();
		model.put("employe", employe);
		employeeservice.saveEmployee(employee);
		
		return "redirect:/listemp";
	}
	@RequestMapping(value ="/listemp", method = RequestMethod.GET)
	public ModelAndView listEmployee() 
	{
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee",  employeeservice.Employeelist());
		
		/*List<Employee> listEmp=(List<Employee>) model.get("employee");
		System.out.println("list size "+listEmp.size());
		Employee emp=listEmp.get(0);
		System.out.println(emp.getEmpid()+emp.getEname()+emp.getSalary()+emp.getAddeddate());*/
		return new ModelAndView("employeelist", model);
		
	}

	@RequestMapping(value ="/addemp", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee,
			BindingResult result) {
		
		System.out.println("hi thiru");
		return new ModelAndView("employee");
	}
}
