package com.striver.ds;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSort[] employees = {

				new EmployeeSort("J", "Red", 51000, "IT"), new EmployeeSort("A", "Green", 71600, "IT"),
				new EmployeeSort("M", "Black", 35187.5, "Sales"),
				new EmployeeSort("K", "Yellow", 47100.77, "Marketing"), new EmployeeSort("L", "Pink", 62001, "IT"),
				new EmployeeSort("D", "Blue", 32001, "Sales"), new EmployeeSort("W", "Brown", 42361.4, "Marketing") };

		List<EmployeeSort> list = Arrays.asList(employees);
		list.stream().forEach(System.out::println);

		// Group Employee By Department

		Map<String, List<EmployeeSort>> groupedByDepartment = list.stream()
				.collect(Collectors.groupingBy(EmployeeSort::getDepartment));
		groupedByDepartment.forEach(

				(department, employeesInDept) -> {

					System.out.println(department);

					employeesInDept.forEach(employee -> System.out.println(employee));

				}

		);

	}

	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	public EmployeeSort(String firstName, String lastName, double salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeSort [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", department=" + department + "]";
	}
}
