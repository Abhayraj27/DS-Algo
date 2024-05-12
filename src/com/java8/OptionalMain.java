package com.java8;

import java.util.*;

public class OptionalMain {

	public static Customer getCustomerByEmailId(String email) throws Exception {

		List<Customer> customers = EkartDataBase.getAll();

	return	customers.stream().filter(customer -> customer.getEmail().
				equals(email)).findAny().orElseThrow(()-> new Exception("No Customer Present"));
	

	}

	public static void main(String[] args) throws Exception {

////		String book = "JAva8";
//		String book = null;
//
//		Optional<String> bookOptional = Optional.ofNullable(book);
//
////		System.out.print(bookOptional.get());
//
//		System.out.print(bookOptional.orElse("abc"));

		Customer customer = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));

		Optional.empty();
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		// Optional<Optional<String>> emailOptional = Optional.of(customer.getEmail());
		// System.out.println(emailOptional);
		Optional<Optional<String>> optionalNullable = Optional.ofNullable(customer.getEmail());

//	 if(optionalNullable.isPresent()) {
//		 
//		 System.out.print(optionalNullable.get());
//		 
//	 }
		// System.out.print(optionalNullable.orElseGet("default@gmail.com"));
		
		getCustomerByEmailId("pqr");

	}

}
