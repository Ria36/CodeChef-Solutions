/* https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DISTINCTCOL?tab=statement */
/* Distinct Colors */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DistinctColors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		   
		    int n=sc.nextInt();
		    int a[]=new int[n];
		   
		    for(int j=0;j<n;j++)
		    a[j]=sc.nextInt();
		     int max=a[0];
		     for(int j=0;j<n;j++)
		    if(a[j]>max)
		    max=a[j];
		    System.out.println(max);
		}
	}
}
