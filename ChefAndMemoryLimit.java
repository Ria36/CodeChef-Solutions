/* https://www.codechef.com/problems/CBARG */
/* Chef and Memory Limit */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndMemoryLimit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int  n=s.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=s.nextInt();
		    }
		    long k=arr[0];
		    for(int i=0;i<n-1;i++)
		    {
		         if(arr[i+1]>arr[i]) k+=(arr[i+1]-arr[i]);
		  
		    }
		    System.out.println(k);
		}
	}
}

