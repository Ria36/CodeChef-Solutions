/* https://www.codechef.com/problems/LPC */
/* Lockpicking Chef */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LockpickingChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    
		    String s=sc.next();
		    String k=sc.next();
		    
		    int totalMoves=0;
		    int minMoves=Integer.MAX_VALUE;
		    for(int i=0;i<=(n-m);i++)
		    {
		          totalMoves=0;
		        String ss=s.substring(i);
		        //System.out.println(ss);
		        for(int j=0;j<m;j++)
		        {
		           
		            int a1=(int)ss.charAt(j);
		            int a2=(int)k.charAt(j);
		            totalMoves+=Math.min(Math.abs(a1-a2),(10-Math.abs(a1-a2)));
		        }
		        minMoves=Math.min(minMoves,totalMoves);
		        //System.out.println(k);
		    }
		    
		    System.out.println(minMoves);
		}
	}
}
