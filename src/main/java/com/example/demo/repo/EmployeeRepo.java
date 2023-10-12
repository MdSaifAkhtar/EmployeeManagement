package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findByName(String name);
	public List<Employee> findByDesig(String desig);
	public List<Employee> findByAgeGreaterThan(int age);
	@Query("from Employee where desig=?1 order by age desc")
	public List<Employee> myOwnQuery(String d);
//	@Query("from Employee where age>=?1 order by eid desc")
//	public List<Employee> myOwnQuery2(int a); {

}
