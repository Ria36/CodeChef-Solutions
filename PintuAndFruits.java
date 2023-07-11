/* https://www.codechef.com/problems/CHPINTU */
/* Pintu and Fruits */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PintuAndFruits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int k=0;k<t;k++){
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int f[]=new int[n];
	        int p[]=new int[n];
	        for(int j=0;j<n;j++)
	        f[j]=sc.nextInt();
	        for(int j=0;j<n;j++)
	        p[j]=sc.nextInt();
	       if(n==1){System.out.println(p[0]);continue;}
		    
		    boolean[] tab= new boolean[m+1];
		    int[] arr= new int[m+1];
		    int ans=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++)
		    {
		        arr[f[i]]=arr[f[i]]+p[i];
		        tab[f[i]]=true;
		    }
		    for(int i=1;i<=m;i++)
		    {
		        if(tab[i]&&arr[i]<ans)
		        ans=arr[i];
		    }
		    
		    System.out.println(ans);
	    }
	}
}
