package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ComparatorExampleUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>  empList = new ArrayList<Employee>();
		createEmployeeList(empList);
//		System.out.println(empList);
//		
//		List<Employee>  empList1 = empList.stream().sorted(Comparator.comparing(Employee::getName)).
//				collect(Collectors.toList());
//		empList1.forEach(empName->System.out.println(empName.getName()));
//		
		
//		List<Employee>  empList2 = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).
//				collect(Collectors.toList());
//		empList2.forEach(empName1->System.out.println(empName1.getName()));
		
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
				                                             .thenComparing(Employee::getCity);
		System.out.println();
		empList.sort(groupByComparator);
		System.out.println("Employee after groupBy sorting:");
		
		empList.forEach(emp->System.out.println(emp.getName() +" "  + "city:" + " " +  emp.getCity()));
		
		
		
		
		
		
		

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
		emp2.setName("Bunti");
		emp2.setCity("CST");
		emp2.setId("2");
		
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
	}

}
