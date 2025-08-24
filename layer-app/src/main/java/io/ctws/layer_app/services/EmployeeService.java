package io.ctws.layer_app.services;

import java.util.ArrayList;
import java.util.List;

import io.ctws.layer_app.pojo.Employee;

public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	public boolean addEmployee(Employee emp) {
		return this.empList.add(emp);
	}

	public boolean addAllEmployee(List<Employee> empList) {
		return this.empList.addAll(empList);
	}

	public Employee getEmplyeeById(long id) {
		List<Employee> filter = this.empList.stream().filter(emp -> emp.getId() == id).toList();
		return filter.getFirst();
	}

}
