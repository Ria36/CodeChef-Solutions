/* https://www.codechef.com/problems/LIFTME */
/* Lift Requests */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LiftRequests
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int q=sc.nextInt(); 
		    long sum=0;
		    int ground_floor=0;
		    for(int i=0;i<q;i++){
		        int start=sc.nextInt();
		        int end=sc.nextInt();
		        sum+=Math.abs(ground_floor-start);
		        sum+=Math.abs(end-start);
		        ground_floor=end;
		    }
		    System.out.println(sum);
		}
	}
}

