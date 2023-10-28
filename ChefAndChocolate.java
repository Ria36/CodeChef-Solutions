/* https://www.codechef.com/problems/CHCHCL */
/* Chef and Chocolate */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndChocolate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int i,t;
		t=sc.nextInt();
        while(t-->0)
		{
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  int abc=x*y;
		  if(abc%2==0)
		  System.out.println("Yes");
		  else
		  System.out.println("No");
		}
	}
}
