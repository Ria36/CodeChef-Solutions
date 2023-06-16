/* https://www.codechef.com/problems/AMMEAT */
/* Andrew and the Meatballs */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AndrewAndTheMeatballs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int i;long sum=0,f=0;
		    int n=sc.nextInt();
		    long m=sc.nextLong();
		    long p[]=new long[n];
		    for(i=0;i<n;i++)
		        p[i]=sc.nextLong();
		    Arrays.sort(p);
		    for(i=n-1;i>=0;i--)
		    {
		        sum+=p[i];
		        if(sum>=m)
		        {
		            System.out.println(n-i);
		            f=1;
		            break;
		        }
		    }
		    if(f==0)
		    System.out.println("-1");
		}
	}
}
