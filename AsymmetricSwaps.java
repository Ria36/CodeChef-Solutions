/* https://www.codechef.com/problems/ARRSWAP */
/* Asymmetric Swaps */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AsymmetricSwaps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,i;
		t=in.nextInt();
		while(t-->0)
		{
		    int l=in.nextInt();
		    int a[]=new int[l*2];
		    for(i=0;i<l*2;i++)
		    {
		        a[i]=in.nextInt();
		    }
		    
		    Arrays.sort(a);
		    int min=a[l*2 - 1];
		    for(i=0;i<=l;i++)
		    {   
		        
		        min=Math.min(min,(a[i+l-1]-a[i]));
		    }
		    System.out.println(min);
		    
		}
	}
}
