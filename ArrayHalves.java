/* https://www.codechef.com/practice/course/2-star-difficulty-problems/DIFF1500/problems/ARRHALVES?tab=statement */
/* Array Halves */

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayHalves
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
	    {
	        int n=sc.nextInt();
	        long A[]=new long[2*n];
	        long count=0l,ops=0l;
	        for(int i=0;i<2*n;i++)
	        {
	            A[i]=sc.nextLong();
	            if(A[i]>n)
	                count++;
	            else
	                ops+=count;
	        }
	        System.out.println(ops);
	    }

	}
}

