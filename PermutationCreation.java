/* https://www.codechef.com/problems/PERMCREATE */
/* Permutation Creation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PermutationCreation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    if(n<4)
		    System.out.println(-1);
		    else if(n==4)
		    System.out.print("3 1 4 2");
		    else
		    {
		        int i;
		        int a[]=new int[n];
		    for(i=0;i<n;i++)
		    a[i]=i+1;
		    i=0;
		    while(i<n){
		    System.out.print(a[i]+" ");
		    i+=2;
		    }
		    i=1;
		    while(i<n)
		    {
		        System.out.print(a[i] + " ");
		        i+=2;
		    }
		}
		  System.out.println();
		}
	}
}
