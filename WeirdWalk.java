/* https://www.codechef.com/problems/WWALK */
/* Weird Walk */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WeirdWalk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for (int t=0;t<T;t++)
	    {
	        int n = s.nextInt();
	        long[] a = new long[n];
	        long[] b = new long[n];
	        for (int i = 0;i<n;i++)
	        {
	            a[i] = s.nextLong();
	        }
	        for (int i = 0;i<n;i++)
	        {
	            b[i] = s.nextLong();
	        }
	        long wd = 0;
	        long alice = 0;
	        long bob = 0;
	        for (int i = 0;i<n;i++)
	        {
	            if (a[i]==b[i] && alice==bob)
	            {
	                wd+=a[i];
	            }
	            alice+=a[i];
	            bob+=b[i];
	        }
	        System.out.println(wd);
	    }
	}
}
