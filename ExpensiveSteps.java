/* https://www.codechef.com/problems/EXPSTP */
/* Expensive Steps */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ExpensiveSteps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int p=Math.min(a,n-a+1);
		    int q=Math.min(b,n-b+1);
		    int c=Math.min(x,n-x+1);
		    int d=Math.min(y,n-y+1);
		    System.out.println(Math.min(Math.abs(x-a)+Math.abs(y-b),Math.min(c,d)+Math.min(p,q)));
		    
		    
		}
	}
}

