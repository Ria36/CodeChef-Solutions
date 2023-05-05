/* https://www.codechef.com/problems/AXNODR */
/* Dazzling AXNODR Challenge */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DazzlingAXNODRChallenge
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    while(t-->0){
	        long N=sc.nextLong();
		    if(N%4==3||N%4==2){
		        System.out.println(3);
		        
		    }
		    else if(N%4==1){
		        System.out.println(N);
		    }
		    
		    else if(N%4==0){
		        System.out.println(N+3);
		    }
	    }
	}
}
