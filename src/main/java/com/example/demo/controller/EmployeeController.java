package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String welcomePage()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/allEmp")
	@ResponseBody
	public List<Employee> allEmployees()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/searchEmp")
	@ResponseBody
	public Employee getEmp(int eid)
	{
		return repo.findById(eid).orElse(new Employee());
	}
	

	
	@RequestMapping(path = { "/addEmp"})
	public String updateOrAddEmp(Employee e)
	{
		repo.save(e);
		return "index.jsp";
	}

	
	@RequestMapping("/searchEmpByName")
	@ResponseBody
	public List<Employee> getEmpByName(String user)
	{
		return repo.findByName(user);
	}

	@RequestMapping("/searchEmpByDesig")
	@ResponseBody
	public List<Employee> getEmpByDesig(String d)
	{
		return repo.findByDesig(d);
	}

	@RequestMapping("/searchEmpByAge")
	@ResponseBody
	public List<Employee> getEmpByAge(int age)
	{
		return repo.findByAgeGreaterThan(age);
	}

//	@RequestMapping("/searchEmpByDesigAndSort")
//	@ResponseBody
//	public List<Employee> getEmpByDesigAndSort(String d)
//	{
//		return repo.myOwnQuery(d);
//	}

	/*
	@RequestMapping("/searchEmpByDesigAndSort")
	public String getEmpByDesigAndSort(String d, Model m)
	{
		List<Employee> list = repo.myOwnQuery();
		m.addAttribute("emps", list);
		return "empDisplay";
	}
	*/

}
