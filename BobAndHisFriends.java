/* https://www.codechef.com/problems/BFRIEND */
/* Bob and His Friends */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BobAndHisFriends
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		 int N,a,b,c;
		     N=sc.nextInt();
		    a=sc.nextInt();
		     b=sc.nextInt();
		      c=sc.nextInt();
		   
		  int f[]=new int[N];
		    long ans=Long.MAX_VALUE;
		      for(int i=0;i<N;i++){
		          f[i]=sc.nextInt();
		      
		
		 long x=Math.abs(f[i]-b);
		  long y=Math.abs(f[i]-a);
		  long temp=x+y;
		          if(ans>temp){
		              ans=temp;
		          }
		      }
		  long fians=(long) (c+ans);
		    System.out.println(fians);
		}
	}
}

