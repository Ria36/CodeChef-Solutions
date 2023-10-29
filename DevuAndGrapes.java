/* https://www.codechef.com/problems/DEVUGRAP */
/* Devu and Grapes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DevuAndGrapes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long k=sc.nextInt();
		  long c=0;
		  long m=(int)Math.pow(10,9)+7;
		  while(n-->0)
		  {
		    long x=sc.nextLong();
		    long r=x/k;
		    long p=x-k*r;
		    long q=k*(r+1)-x;
            if(r==0)
              c+=q%m;
		    else
		      c+=(int)Math.min(p,q)%m;
		  }
		  System.out.println(c);
		}
	}
}
