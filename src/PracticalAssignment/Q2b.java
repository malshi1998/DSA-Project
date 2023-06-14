package PracticalAssignment;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class Q2b {
	
	public static Integer findMax(LinkedList<Integer> ll)
    {
  
       
		if (ll == null || ll.size() == 0) {
            return Integer.MAX_VALUE;
        }
  
        // create a new list to avoid modification
        // in the original list
		LinkedList<Integer> sll = new LinkedList<>(ll);
  
        // sort list in natural order
        Collections.sort(sll);
        return sll.get(sll.size() - 1);
       
    }

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		 Scanner sc = new Scanner(System.in);

	    for(int n=1;n<13;n++) {
	    System.out.println("Enter the income of " + n + "  Month:");
	    
	    		int number = sc.nextInt();
	            ll.add(number);
	               
	        }
	    
	    System.out.println("Income of 12 Months are "+ll); 
	    System.out.println("Maximum income is " + findMax(ll));
	    
}
	

}

