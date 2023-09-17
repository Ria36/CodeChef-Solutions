/* https://www.codechef.com/problems/REMOVEMUL */
/* Remove Multiples */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemoveMultiples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    long s1=0;
		    int z=s.nextInt();
		    int x=s.nextInt();
		    int [] a=new int[x];
		    for(int i=0;i<x;i++){
		        a[i]=s.nextInt();
		    }
		    for(int i=0;i<x;i++){
		        s1+=a[i];
		    }
		    long d=(long)z*(z+1)/2;
		    System.out.println(d-s1);
		}
	}
}
