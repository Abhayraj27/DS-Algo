package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>  empList = new ArrayList<Employee>();
		createEmployeeList(empList);
		
		Map<String,List<Employee> >   empMap  = 
		
		
		empList.stream().
		        collect(Collectors.groupingBy(Employee::getCity));
		
		
		empMap.forEach((key,value)->System.out.println(" city :" + key + "employee :" + value));

	}
	
	public static void createEmployeeList(List<Employee> empList) {
		
		Employee emp = new Employee();
		emp.setName("abhay");
		emp.setCity("BLR");
		emp.setId("1");
		
		
		Employee emp1 = new Employee();
		emp1.setName("abhishek");
		emp1.setCity("DEL");
		emp1.setId("2");
		
		Employee emp2 = new Employee();
		emp2.setName("abhishek");
		emp2.setCity("CST");
		emp2.setId("2");
		
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
	}
	
}
