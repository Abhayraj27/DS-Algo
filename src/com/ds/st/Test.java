package com.ds.st;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoBst1 demoBst1 = new DemoBst1();
		int n, num;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many number to be input");
		n = scan.nextInt();

		System.out.println("Enter" + n + "numbers:");
		for (int i = 0; i < n; i++) {
			num = scan.nextInt();
			demoBst1.insertIntoTree(num);
		}
		System.out.println("Tree Insertion done");
		System.out.println("Enter Number to be searched");
		 n = scan.nextInt();
		 if(demoBst1.serchIntoTree(n)!=null) {
			 System.out.println("Number found");
			 
		 }
		 else {
			 System.out.println("Number not found");
		 }
		 
		 System.out.println("Inorder Traversal of Binary serach Tree");
		 demoBst1.inOrderTraversal();
		  
		  System.out.println("\nPreorder Traversal of Binary serach Tree");
		  demoBst1.preOrderTraversal();
		 
		  System.out.println("\nPostorder Traversal of Binary serach Tree");
		  demoBst1.preOrderTraversal();
		
		}

}
