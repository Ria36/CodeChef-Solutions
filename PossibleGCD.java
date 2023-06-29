/* https://www.codechef.com/problems/DISTGCD */
/* Possible GCD */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PossibleGCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int t,q; 
			Scanner sc=new Scanner(System.in);
	        t=sc.nextInt();
		for(q=1;q<=t;q++)
		{
		  int a,b,count=0;
		  a=sc.nextInt();
		  b=sc.nextInt();
		  if(b>a)
		  {
		      int temp=a;
		      a=b;
		      b=temp;
		  }
		  for(int c=1;c*c<=(a-b);c++)
		  {
		      if((a-b)%c==0)
		      count++;
		      if((a-b)%c==0&&(a-b)!=c*c) count++;
		  }
		  System.out.println(count);
	}
	}
}

