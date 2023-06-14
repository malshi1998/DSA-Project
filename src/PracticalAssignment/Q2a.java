package PracticalAssignment;

import java.util.LinkedList;
import java.util.Scanner;



public class Q2a {

	public static void main(String[] args) {
	
		
		 LinkedList<Integer> ll = new LinkedList<>();
		 Scanner sc = new Scanner(System.in);

	    for(int n=1;n<13;n++) {
	    System.out.println("Enter the income of " + n + "  Month:");
	    
	    		int number = sc.nextInt();
	            ll.add(number);
	               
	        }
	    
	    System.out.println("Income of 12 Months are "+ll);            
	}
}