/* https://www.codechef.com/problems/MAXFUN */
/* Maximise Function */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximiseFunction
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    long b=a[0];
	    long c=a[n-1];
	    long d=a[1];
	    
	    long x=Math.abs(b-c);
	    long y=Math.abs(c-d);
	    long z=Math.abs(d-b);
	    System.out.println(x+y+z);
	}
	}
}

