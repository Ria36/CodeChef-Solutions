/* https://www.codechef.com/problems/MAKEEQUAL */
/* Make them equal */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeThemEqual
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    int max=0;
		    int min=1000000;
		    
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        if(ar[i]>max)
		        {
		            max=ar[i];
		        }
		        if(ar[i]<min)
		        {
		            min=ar[i];
		        }
		        
		    }
		    System.out.println(max-min);
		}
	}
}

