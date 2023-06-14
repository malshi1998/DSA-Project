package dsa_project;

import java.util.Scanner;



public class taxi {
	public static void main(String[]args) {
	
	System.out.println("Enter the distance :");
	Scanner d= new Scanner(System.in);
	double distance=d.nextDouble();
	
	System.out.println("Enter the time :");
	Scanner t=new Scanner(System.in);
	double time=t.nextDouble();
	
	
	
	
	System.out.println("your distance :" +distance);
	
	
	System.out.println(" Waiting time = "+time);
	
	
	if((distance==1)&&(time==3)) {
		System.out.println( "total fare : 50LKR");
	}
	
	else if((distance>1)&&(time>3)) {
		
	System.out.println("Total fare : "+(((distance-1)*25)+((time-3)*4)+50));
	}
	
	else if((distance==1)&&(time>3)) {
		System.out.println("Total free= "+(((time-3)*4)+50));
	}
	else if((distance>1)&&(time==3)) {
		System.out.println("Total fare : "+(((distance-1)*25)+50));
	}
	
	}

}
