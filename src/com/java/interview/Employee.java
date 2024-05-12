package com.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee> {

	private String fName;
	private String lName;
	private int salary;
	private int empId;

	// Getter
	public String getFNAme() {
		return fName;
	}

	// Setter
	public void setFName(String fName) {
		this.fName = fName;
	}

	// Setter
	public void setLName(String lName) {
		this.lName = lName;
	}

	// Getter
	public String getLNAme() {
		return lName;
	}

	// Getter
	public int getSalary() {
		return salary;
	}

	// Setter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Getter
	public int getEmpId() {
		return empId;
	}

	// Setter
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", salary=" + salary + ", empId=" + empId + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(12001);
		e1.setFName("Austin");
		e1.setLName("Honda");
		e1.setSalary(10000);

		Employee e2 = new Employee();
		e2.setEmpId(12001);
		e2.setFName("1");
		e2.setLName("Berg");
		e2.setSalary(15000);

		Employee e3 = new Employee();
		e3.setEmpId(12001);
		e3.setFName("Adam");
		e3.setLName("lather");
		e3.setSalary(11000);

		Employee e4 = new Employee();
		e4.setEmpId(12001);
		e4.setFName("Hayden");
		e4.setLName("pitch");
		e4.setSalary(12000);

		Employee e5 = new Employee();
		e5.setEmpId(12001);
		e5.setFName("2");
		e5.setLName("Honda");
		e5.setSalary(13000);

		Employee e6 = new Employee();
		e6.setEmpId(12001);
		e6.setFName("3");
		e6.setLName("jerome");
		e6.setSalary(14000);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

	empList.stream().filter(salary->salary.getSalary()>12500).map(
			
			
			l->l.getLNAme()
			
			).sorted().forEach(System.out::println);
	
	//forEach(lastName->System.out.println(lastName.getLNAme()));
	
	//forEach(System.out::println);
				
		
		//List<Employee> sortedEmpls =	epls.stream().sorted().collect(Collectors.toList());
		
		//sortedEmpls.forEach(lastName->System.out.println(lastName.getLNAme()));
		
		//System.out.print(sortedEmpls);

		}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
