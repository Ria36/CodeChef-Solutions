/* https://www.codechef.com/problems/REPEAT */
/* Odd Repeat */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
	       
	         Scanner s= new Scanner(System.in);
		    int n=s.nextInt();
		    int arr[][]= new int[n][3];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<3;j++)
		        {
		            arr[i][j]=s.nextInt();
		        }
		    }
		    
		    int j=0;
		    int a=0;
		    for(int i=0;i<n;i++)
		    {
		           a=(arr[i][2] - (arr[i][0]*arr[i][0]))/(arr[i][1]-1);
		    System.out.println(a);
		    }
	    }catch(Exception e){
	        
	    }
	}
}
