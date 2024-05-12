package com.striver.ds;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String x = "We are proud Indians and Indians Indians Indians are are Spreaded Spreaded in world";
	       String[] y = x.split(" ");
	       System.out.println(y.length);
	       
	       HashMap<String ,Integer> hm = new HashMap<>();
	       
	       for(int i=0;i<y.length-1;i++){
	           
	           
	           if(hm.containsKey(y[i])){
	               
	               
	               hm.put(y[i],hm.get(y[i])+1);
	               
	               
	               }
	               else{
	                   
	                   hm.put(y[i],1);
	               }
	           
	           }
	           // print frequency of word
	         System.out.println(hm);
	         
	         
	        // Get values from map
	           
	           Collection<Integer> repeatedWord = hm.values();
	           
	           Object repeated[] = repeatedWord.toArray();
	           
	           System.out.println(repeatedWord);
	           
	           int temp;
	           //sort the value
	           
	           for(int i =0;i<repeated.length;i++){
	               
	               for(int j=0;j<repeated.length-1;j++){
	                   
	                    if((int)repeated[i]>(int)repeated[j]){
	                        
	                        temp = (int)repeated[i];
	                        
	                        repeated[i] = repeated[j];
	                        
	                        repeated[j] = temp;
	                        
	                       }
	                   
	                   
	               }
	               
	               
	           }
	           
	            System.out.println(Arrays.toString(repeated));
	            
	                for (Map.Entry<String,Integer> entry : hm.entrySet()) {
	                    
	                     if(entry.getValue()==repeated[0]){
	                
	              System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	                
	                
	                 }
	            
	              }
	           
	        
	    
	    }

	}


