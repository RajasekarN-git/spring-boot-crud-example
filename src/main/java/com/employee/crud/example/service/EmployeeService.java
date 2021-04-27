

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employeeEntity.EmployeeEntity;
import com.example.demo.employeeRepository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<EmployeeEntity> getAllEmployee()
	{
	return employeeRepository.findAll();
	}
	//getting a specific record by using the method findById() of CrudRepository
	public EmployeeEntity getEmployeeById(int id)
	{
	return employeeRepository.findById(id).get();
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public String delete(int empId)
	{
		employeeRepository.deleteById(empId);
		return "Deleted";
	}
	//updating a record
	public String update(EmployeeEntity emp)
	{
		EmployeeEntity e = new EmployeeEntity();
		e.setEmpDesignation(emp.getEmpDesignation());
		e.setEmpName(emp.getEmpName());
		employeeRepository.save(emp);
		return "Saved";
	}
	public String insert(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return "Value Inserted";
	}
}
