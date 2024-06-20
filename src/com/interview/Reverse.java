package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> listRev = Arrays.asList("A", "AB", "BC", "CD");
		 List<String> listRev1 = listRev.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	      
	      listRev1.forEach(x->System.out.println("Reverse Element:"+x));
	      
	      //Get the list of places into another list which names begins with 
	      //letter P and length is greater than 4 letters using stream api + lambda exp.
	      
//	      List<String> places = Arrays.asList("Chennai", null, "Pun", null, "Mumbai", "Patna", "Paris", "Pondicherry");
//	      
//	      List<String> placeStartWithP =  places.stream().filter(name->name!=null && name.startsWith("P")).
//	    		  collect(Collectors.toList());
//	      
//	      List<String> placeStartWithGt4 = placeStartWithP.stream().filter(x->x.length()>4).collect(Collectors.toList());
//	      
//	      placeStartWithGt4.forEach(x->System.out.println(x));
	      
	      
//	      write a query to find 2nd highest salary of employee
	      
	      
	      
	      
	     // SELECT  Max(Salary) from employee as emp  salary Not In(SELECT  Max(Salary) from employee);
	      
	      
	      
	   
	    
	      
	      
	  
	   

	}

}
