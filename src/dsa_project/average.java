package dsa_project;

public class average {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,10};
		int total=0;
		
		int n=5;
		
		for(int i=0;i<a.length;i++) 
			total+=a[i];
			
			System.out.println("average :"+total/n);

	

}
}